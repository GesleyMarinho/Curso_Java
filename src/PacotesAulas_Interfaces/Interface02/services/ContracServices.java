package PacotesAulas_Interfaces.Interface02.services;

import PacotesAulas_Interfaces.Interface02.entities.Contract;
import PacotesAulas_Interfaces.Interface02.entities.Installment;

import java.time.LocalDate;

public class ContracServices {
    private OnlinePaymentService onlinePaymentService;

    public ContracServices(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallmentLis().add(new Installment(dueDate, quota));
        }
    }
}
