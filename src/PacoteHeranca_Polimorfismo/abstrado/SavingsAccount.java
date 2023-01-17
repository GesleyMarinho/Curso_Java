package PacoteHeranca_Polimorfismo.abstrado;

public class SavingsAccount extends Account {

    private double interesRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, double interesRate) {
        super(number, holder, balance);
        this.interesRate = interesRate;
    }

    public double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(double interesRate) {
        this.interesRate = interesRate;
    }

    public void updateBalance(double amount) {
        balance += balance * interesRate;
    }


    @Override
    public double withdraw(double amount) {
        //return super.withdraw(amount);
       return balance -= amount;
    }
}
