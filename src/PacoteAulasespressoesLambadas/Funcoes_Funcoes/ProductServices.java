package PacoteAulasEspressoesLambadas.Funcoes_Funcoes;

import java.util.List;
import java.util.function.Predicate;

public class ProductServices {

    public double filteredSum(List<Product> list,
                              Predicate<Product> criterio) {
        double sum = 0;

        for (Product p : list) {
            if (criterio.test(p)) {
                sum += p.getPreco();
            }
        }
        return sum;
    }
}
