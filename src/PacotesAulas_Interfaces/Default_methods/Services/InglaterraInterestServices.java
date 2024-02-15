package PacotesAulas_Interfaces.Default_methods.Services;

public class InglaterraInterestServices implements  InterestService{

    public double interestRateEN;

    public InglaterraInterestServices(double interestRateEN) {
        this.interestRateEN = interestRateEN;
    }

    @Override
    public double getInterestRate() {
        return interestRateEN;
    }
}
