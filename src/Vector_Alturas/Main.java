package Vector_Alturas;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.printf("Quantas pessoas vão ser cadastradas ? ");
        int n = ler.nextInt();
        double idadeMedia16 = 0;
        double cont =0;
        double mediaAltura =0;
        double soma =0;

        Dados_Pessoas[] vect = new Dados_Pessoas[n];

        for(int i=0; i< vect.length; i++) {
            ler.nextLine();
            System.out.printf("Qual o Nome: ");
            String nome = ler.nextLine();
            System.out.printf("Qual a Altura: ");
            double altura = ler.nextDouble();
            System.out.printf("Qual a Idade: ");
            int idade = ler.nextInt();
            vect[i] = new Dados_Pessoas(nome, altura, idade);
        }

        for (int i=0; i < vect.length;i++){
            soma += vect[i].getAltura();
        }

        for (int i =0; i< vect.length;i++){
            if(vect[i].getIdade() <=16){
                idadeMedia16+= vect[i].getIdade();
                cont++;
            }
        }


        mediaAltura = soma / n;
        idadeMedia16 = (float) (cont / n) * 100;

        ler.nextLine();
        System.out.printf("A Porcetagem de pessoas abaixo dos 16 anos é : %.2f" , idadeMedia16);
        ler.nextLine();
        System.out.printf("A Média da Altura é %.2f" , mediaAltura);

        for(int i =0; i< vect.length;i++){
            if(vect[i].getIdade()< 16) {
                System.out.println("Nome : " + vect[i].getNome());
            }
        }
    }
}

