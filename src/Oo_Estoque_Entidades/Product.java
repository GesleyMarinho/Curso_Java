package Oo_Estoque_Entidades;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValorEstoque(){

        return this.preco * quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade ;
    }

    public void removerQuantidade (int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome = '" + nome + '\'' +
                ", preco = " + totalValorEstoque() +
                ", Quantidade = " + quantidade +
                '}';
    }
}
