package PacoteHeranca_Polimorfismo.Exemplo;

import PacoteHeranca_Polimorfismo.Exemplo.Conta;

public class ContaComercial extends Conta {

    private double emprestimoLimite;

    public ContaComercial() {
        super();
    }

    public ContaComercial(Integer numeroConta, String nome, double saldo, double emprestimoLimite) {
        super(numeroConta, nome, saldo);
        this.emprestimoLimite = emprestimoLimite;
    }

    public double getEmprestimoLimite() {
        return emprestimoLimite;
    }

    public void setEmprestimoLimite(double emprestimoLimite) {
        this.emprestimoLimite = emprestimoLimite;
    }

    public void emprestimo(double valor){
        if(valor <= emprestimoLimite){
            //deposito(valor);
            saldo += valor - 10 ;
            System.out.println("Emprestimo realizado ");
        }else{
            System.out.println("Emprestimo Negado ");
        }
    }

    @Override
    public void retirada(double valor) {
        super.retirada(valor);
        saldo -= 2;
    }
}
