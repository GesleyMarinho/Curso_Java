package Vetor_Dados_Pessoas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);

        System.out.printf("Quantas pessoas serão cadastradas para Teste: ");
        int n = ler.nextInt();
        int contM = 0;
        int contF=0;

        double maiorAltura = 0;
        double menorAltura = 999;
        double mediaAlturaMulheres = 0;

        DecimalFormat df = new DecimalFormat("#,###.00");
        Dados dados[] = new Dados[n];

        for (int i = 0; i < dados.length; i++) {
            System.out.printf("Qual a altura da Pessoa : ");
            double altura = ler.nextDouble();
            ler.nextLine();
            System.out.printf("Qual o Sexo da Pessoa: ");
            char sexo = ler.next().charAt(0);

            dados[i] = new Dados(sexo, altura);
            if ((dados[i].getSexo() == 'M') || (dados[i].getSexo() == 'm')) {
                contM++;
            }

            if (dados[i].getAltura() > maiorAltura) {
                maiorAltura = dados[i].getAltura();
            }
            if (dados[i].getAltura() < menorAltura) {
                menorAltura = dados[i].getAltura();
            }
            if(dados[i].getSexo()=='F' || dados[i].getSexo() == 'f'){
                contF++;
                mediaAlturaMulheres += dados[i].getAltura();
            }
        }
        mediaAlturaMulheres = mediaAlturaMulheres / contF;
        System.out.println("Qual a maior Altura: " + maiorAltura);
        System.out.println("Quantos Homens tem cadastrados: " + contM);
        System.out.println("Qual a media de altura das mulheres: "+ df.format(mediaAlturaMulheres) );
        System.out.println("Qual a menor Altura: "+ menorAltura);
    }
}
