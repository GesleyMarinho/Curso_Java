package PacoteAulasespressoesLambadas.Ex01Comparator;

public class Product {
    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
        this.nome = nome;
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
        return "Product{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                '}';
    }
}
