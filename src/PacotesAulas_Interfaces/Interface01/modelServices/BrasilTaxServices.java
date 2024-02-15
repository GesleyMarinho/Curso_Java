package PacotesAulas_Interfaces.Interface01.modelServices;

public class BrasilTaxServices implements TaxService{

    public double tax(double amount) {
        if (amount < 100) {
            return amount * 0.20;
        } else {
            return amount * 0.15;
        }
    }

    @Override
    public double interest(Double amount, int months) {
        return 0;
    }
}
