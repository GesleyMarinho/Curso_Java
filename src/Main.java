import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int contador = 1; // Contador para o número de CASEs


        while (true) {

            int n = ler.nextInt(); // números de marmores
            int q = ler.nextInt(); // números de consultas
            if (n == 0 && q == 0) {
                System.out.println("Programa Finalizado!");
                break;
            }


            int[] vetor = new int[n];

            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = ler.nextInt();
            }

            java.util.Arrays.sort(vetor);
            System.out.println("CASE #" + contador + ":");

            for (int i = 0; i < q; i++) {
                int a = ler.nextInt();
                int position = java.util.Arrays.binarySearch(vetor, a);


                if (position >= 0) {
                    System.out.println("Case # " + contador);
                    System.out.println(a + " found at " + position);
                } else {
                    System.out.println("CASE #" + contador);
                    System.out.println(a + " not found");
                }
            }

            contador++;
        }

        ler.close();
    }
}
