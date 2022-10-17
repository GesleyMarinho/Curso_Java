package Vetores_Soma_vetores;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas posições terá o nosso vetor : ");
        int n = ler.nextInt();

        double vectA[] = new double[n];
        double vectB[] = new double[n];
        double vectC[] = new double[n];
        System.out.println("Preencher do Vetor A");
        for( int i=0; i<vectA.length;i++){
            vectA[i] = ler.nextDouble();
        }
        System.out.println("Preenchendo o Vetor B");
        for(int i=0; i<vectB.length;i++){
            vectB[i] = ler.nextDouble();
        }

        System.out.println("A Soma  dos Vetores A e B é:");
        for(int i=0;i<vectA.length;i++){
            //for (int j=0;j<vectB.length;j++){
                vectC[i] = vectA[i] + vectB[i];
            //}
        }

        for (int i=0; i<vectC.length;i++){
            System.out.println("" + vectC[i]);
        }
    }
}
