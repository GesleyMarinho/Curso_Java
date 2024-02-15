package PacotesAulas_Interfaces.Interface02.services;

public interface OnlinePaymentService {

   double paymentFee( Double amount);
   double interest (Double amount, int months);
}
