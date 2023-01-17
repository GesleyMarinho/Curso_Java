package PacoteHeranca_Polimorfismo.ExemploAbastract;

public   class Poupanca extends Conta {
    private double taxaJuros;

    public Poupanca(){
        super();
    }

    public Poupanca(Integer numeroConta, String nome, double saldo, double taxaJuros) {
        super(numeroConta, nome, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void juros(){
        saldo += saldo * taxaJuros;
    }

    @Override
    public void retirada(double valor) {
        saldo -= valor;

    }
}
