package Modulo_estrutura_Repeticao;

import java.util.Scanner;
/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
public class Ex04 {

    public static void main (String[] args) {

        Scanner ler = new Scanner(System.in);

        //int horaFinal, horainicial, duracao = 0;

        System.out.printf("Digite a hora que começou : ");
        int horainicial = ler.nextInt();

        System.out.printf("Digite a hora que terminou : ");
        int horaFinal = ler.nextInt();

        int duracao=0;
        if(horaFinal<horainicial){
            duracao = 24 - (horainicial - horaFinal);
        } else if (horainicial > horaFinal || horaFinal == horaFinal) {
            duracao =  (horaFinal - horainicial);
        }

        System.out.printf("A duração do jogo foi de  " + duracao + " Horas");
    }
}
