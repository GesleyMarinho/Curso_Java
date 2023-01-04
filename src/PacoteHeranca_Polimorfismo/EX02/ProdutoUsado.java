package PacoteHeranca_Polimorfismo.EX02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date dataFabricacao ;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado(){

    }
    public ProdutoUsado(String nome, double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String precoEtiqueta() {
        return getNome() + " (Usado) $ " + String.format("%.2f",getPreco()) + " (Data da Fabricação: " + sdf.format(dataFabricacao)+ " ) ";
    }
}
