package PacoteAulasEspressoesLambadas.Function;

import java.util.function.Function;

public class UpperCaseName implements Function<Product,String> {
    @Override
    public String apply(Product p) {
        return p.getNome().toUpperCase();
    }
}
