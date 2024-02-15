package PacoteAulasGenerics_Set_Map.Generic_delimitados;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CalculationService {

    public static <T extends Comparable <? super T >>T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List vazia ");
        }

        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}

