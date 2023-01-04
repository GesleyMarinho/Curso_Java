package PacoteHeranca_Polimorfismo.Exemplo;

public class Conta {
    private Integer numeroConta;
    private String nome;
    protected double saldo;

    public Conta() {
    }

    public Conta(Integer numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public void retirada(double valor) {
        saldo -= valor + 5;

    }

    public void deposito(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta = " + numeroConta +
                ", nome = '" + nome + '\'' +
                ", saldo = " + saldo +
                '}';
    }
}
