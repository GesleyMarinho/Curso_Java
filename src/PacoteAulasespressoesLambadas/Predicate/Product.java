package PacoteAulasEspressoesLambadas.Predicate;

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

   public static  boolean staticPredicateProduct(Product p){
        return  p.getPreco() >= 100;
    }

    public  boolean noStaticPredicateProduct(){
        return  getPreco() >= 100;
    }



    @Override
    public String toString() {
        return "Product{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                '}';
    }


}
