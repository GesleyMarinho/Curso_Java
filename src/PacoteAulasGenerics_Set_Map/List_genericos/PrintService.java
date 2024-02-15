package PacoteAulasGenerics_Set_Map.List_genericos;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public void Print() {

        System.out.printf("[");
        if (!list.isEmpty()) {
            System.out.printf(String.valueOf(list.get(0)));
        }
        for (int i=1 ; i < list.size(); i++) {
            System.out.printf(", " + list.get(i));
        }
        System.out.printf("]");

    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista vazia ");
        }
        return list.get(0);
    }

}
