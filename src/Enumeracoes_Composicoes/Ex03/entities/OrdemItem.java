package Enumeracoes_Composicoes.Ex03.entities;

public class OrdemItem {

    private int quantidade;
    private Double preco;

    private Produto produto;

    public OrdemItem(int quantidade, Double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double subTotal () {

        return preco * quantidade;
    }

    @Override
    public String toString() {
        return produto.getNomeProduto()
                + ", $"
                + String.format("%.2f", getPreco())
                + ", Quantidade : "
                + getQuantidade() +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
