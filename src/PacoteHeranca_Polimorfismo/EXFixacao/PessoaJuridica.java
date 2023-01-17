package PacoteHeranca_Polimorfismo.EXFixacao;

public class PessoaJuridica extends Pessoa{

    private double numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, double rendaAnual, double numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public double getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(double numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double Taxas() {

        if( numFuncionarios > 10 ){
           return getRendaAnual() * 0.14;
        } else  {
            return getRendaAnual() * 0.16;
        }
    }


}
