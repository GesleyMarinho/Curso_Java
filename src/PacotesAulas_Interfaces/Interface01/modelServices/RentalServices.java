package PacotesAulas_Interfaces.Interface01.modelServices;

import PacotesAulas_Interfaces.Interface01.entities.CarRental;
import PacotesAulas_Interfaces.Interface01.entities.Invoice;

import java.time.Duration;

public class RentalServices {

    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalServices(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public Double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(Double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public void setBrasilTaxServices(BrasilTaxServices brasilTaxServices) {
        this.taxService = brasilTaxServices;
    }

    public void porcessInvoice(CarRental carRental) {

        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double horas = minutes / 60;

        double basicPayments;

        if (horas <= 12) {
            basicPayments = pricePerHour * Math.ceil(horas);
        } else {
            basicPayments = pricePerDay * Math.ceil(horas / 24);
        }

        double tax = taxService.tax(basicPayments);
        carRental.setInvoice(new Invoice(basicPayments, tax));
    }
}
