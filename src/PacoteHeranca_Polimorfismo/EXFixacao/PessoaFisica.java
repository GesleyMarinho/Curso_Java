package PacoteHeranca_Polimorfismo.EXFixacao;

public class PessoaFisica extends Pessoa{

    private double gastoSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double Taxas() {
        if(getRendaAnual() < 20000 ){
            return getRendaAnual() * 0.15 - gastoSaude * 0.5;
        }else {
            return getRendaAnual() * 0.25 - gastoSaude * 0.5;
        }

    }
}
