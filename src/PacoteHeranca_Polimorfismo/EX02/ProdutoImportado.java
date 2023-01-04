package PacoteHeranca_Polimorfismo.EX02;

import java.text.SimpleDateFormat;

public class ProdutoImportado extends Produto {

    private double taxaImportacao;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoImportado(){

    }
    public ProdutoImportado(String nome, double preco, double taxaImportacao) {
        super(nome, preco);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }
    public double precoTotal(){
        return getPreco() + taxaImportacao;
    }

    @Override
    public String precoEtiqueta() {
        return getNome() +" $ " + precoTotal() + " ( Taxa Importação " + String.format("%.2f",taxaImportacao) + " )" ;
    }
}
