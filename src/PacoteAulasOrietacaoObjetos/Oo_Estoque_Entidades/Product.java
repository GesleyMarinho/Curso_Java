package PacoteAulasOrietacaoObjetos.Oo_Estoque_Entidades;

public class Product {

    private String nome;
    private double preco;
    private int quantidade;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double totalValorEstoque() {

        return this.preco * quantidade;
    }

    public void adicionarQuantidade(int quantidade) {

        this.quantidade += quantidade;
    }

    public void removerQuantidade(int quantidade) {
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome = '" + getNome() + '\'' +
                ", preco = " + totalValorEstoque() +
                ", Quantidade = " + getQuantidade() +
                '}';
    }

}
