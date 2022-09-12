package Função;

import java.util.Scanner;

import static sun.swing.MenuItemLayoutHelper.max;

public class Main {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);

        System.out.printf("Digite 3 valores ");
        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();

        int total = max(a,b,c);
        System.out.printf(" Maior valor foi : " + total);

    }

    public static int max(int x, int y, int z){

        int aux;
        if (x>y && x>z){
            aux = x;

        } else if (y>z) {
            aux =y ;
        }else{
            aux =z;
        }

        return aux;

    }
}
