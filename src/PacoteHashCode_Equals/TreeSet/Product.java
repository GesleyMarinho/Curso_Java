package PacoteHashCode_Equals.TreeSet;

public class Product  implements Comparable<Product>{

    private String nome;
    private Double preco;

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Product() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }


    @Override
    public int compareTo(Product o) {
        return nome.toLowerCase().compareTo(o.nome.toLowerCase());
    }
}
