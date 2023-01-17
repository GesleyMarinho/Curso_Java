package PacoteTratamentoExcexcoes.Ex;

public class Conta {
    private Integer numero;
    private String nome;
    private double saldo;
    private double limiteSaque;

    public Conta(Integer numero, String nome, double saldo, double limiteSaque) {

        /*
        if (!checkOut.after(checkIn)) {
            throw new DomainException(" A data de check-out deve ser posterior à data de check-in");
        }*/

        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
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

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double deposito(double valor) {

        return saldo += valor;
    }

    public void saque(double valor) {
        validarSaque(valor);
        saldo -= valor;
    }

    public void validarSaque(double valor) {
        if (valor > getLimiteSaque()) {
            throw new DomainException("Erro de saque: A quantia excede o limite de saque");
        }
        if (valor > saldo) {
            throw new DomainException("Erro de saque: Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Nome = " + nome + "\n"+
                "Numero da Conta = " + numero +"\n"+
                "Novo saldo = " + saldo +"\n"+
                "Limite de Saque = " + limiteSaque;
    }
}
