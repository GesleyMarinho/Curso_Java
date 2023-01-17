package PacoteHeranca_Polimorfismo.abstrado;

public abstract  class Account {

    private Integer number;
    private String holder;
    protected double balance;

    public Account() {
    }

    public Account(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount ){
        return balance -= amount + 5;
    }

    public void deposit (double amount){
        balance += amount;
    }
}
