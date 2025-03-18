package PacoteAulasEspressoesLambadas.Funcoes_Funcoes;

public class Product {
    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Product() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return nome + ": " + String.format("%.2f", preco);
    }
}
