package PacotesAulas_Interfaces.Default_methods.Services;

public class BrazilInterestService implements InterestService {

    private double interestRateBR;

    public BrazilInterestService(double interestRateBR) {
        this.interestRateBR = interestRateBR;
    }

    @Override // retorna o valor o juros;
    public double getInterestRate() {
        return interestRateBR;
    }
}