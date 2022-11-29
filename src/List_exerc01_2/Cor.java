package List_exerc01_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cor {
    private String cor;
    private int id;

    public Cor() {

    }

    public Cor(String cor, int id) {
        this.cor = cor;
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cor> cadastrarCor(int x) {

        Scanner ler = new Scanner(System.in);
        ArrayList<Cor> coresList = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            Cor cor = new Cor();

            System.out.printf("Qual a Cor: ");
            cor.setCor(ler.next());
            System.out.printf("Qual o ID da Cor: ");
            cor.setId(ler.nextInt());
            coresList.add(cor);
        }
        return coresList;
    }

    public void listarCores(List<Cor> corList) {

        for (int i = 0; i < corList.size(); i++) {
            System.out.println("A Cor é: " + corList.get(i).getCor() + " E o ID da cor é: " + corList.get(i).getId());
        }
    }

    public void pesquisarCorID(List<Cor> corList, int y) {
        for (int i = 0; i < corList.size(); i++) {
            if (corList.get(i).getId() == y) {
                System.out.printf("Cor encontrada " + corList.get(i).getCor() + " id: " + corList.get(i).getId());
                return;
            } else {
                System.out.println("Cor não cadastrada !!!");
                return;
            }
        }
    }

    public void atulizarCor(List<Cor> corList, int a) {
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i < corList.size(); i++) {
            if (corList.get(i).getId() == a) {
                System.out.printf("Qual a nova Cor: ");
                corList.get(i).setCor(ler.next());

            } else {
                System.out.println("Cor não cadastrada !!!");
                return;
            }
        }
    }

    public void removerCor(List<Cor> corList, int a) {
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < corList.size(); i++) {
            if (corList.get(i).getId() == a) {
                System.out.printf("Cor" + corList.get(i).getCor() + "removido com sucesso");
                corList.remove(i);
            } else {
                System.out.printf("Cor não cadastrada !!!!");
                return;
            }
        }
    }
    public ArrayList<Cor> AdicionarCor() {
        Scanner ler = new Scanner(System.in);
        ArrayList<Cor> coresList = new ArrayList<>();

        Cor cor = new Cor();
        System.out.printf("Qual COR vc deseja Adicionar: ");
        cor.setCor(ler.next());
        System.out.printf("Qual ID da cor vc deseja Adicionar: ");
        cor.setId(ler.nextInt());

        //coresList.add(cor);

        return coresList;
    }

}
