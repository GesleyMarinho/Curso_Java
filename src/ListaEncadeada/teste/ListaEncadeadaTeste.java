package ListaEncadeada.teste;


import ListaEncadeada.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String args[]) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<Integer>();

        lista.adiciona(1);
        System.out.print(lista);
    }
}
