package PacoteSet;

import java.util.Objects;

public class Product {
    private String nome;
    private int preco;

    public Product() {
    }

    public Product(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return preco == product.preco && Objects.equals(nome, product.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}
