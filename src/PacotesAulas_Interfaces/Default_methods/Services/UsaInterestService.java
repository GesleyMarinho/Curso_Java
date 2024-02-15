package PacotesAulas_Interfaces.Default_methods.Services;

public class UsaInterestService implements InterestService {

    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override // retorna o percentual do juros
    public double getInterestRate() {
        return interestRate;
    }
}
