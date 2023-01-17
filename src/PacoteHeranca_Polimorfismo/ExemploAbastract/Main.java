package PacoteHeranca_Polimorfismo.ExemploAbastract;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta(1, "Gesley", 1000);
        Conta conta2 = new Poupanca(2,"Debora",1000,50);
        ContaComercial contaComercial = new ContaComercial(2, "Gesley", 1000, 1000);

        conta.retirada(200);
        System.out.println(conta.getSaldo());

        conta2.retirada(200);
        System.out.println("Poupaunça: " + conta2.getSaldo());

        contaComercial.retirada(200);
        System.out.println("Comercial: "+contaComercial.getSaldo());

       // UPCASTING
        Conta conta3 = contaComercial;
        Conta conta4 = new ContaComercial(3, "Dumar", 1000, 5000);
        Conta conta5 = new Poupanca(4, "Anna", 0, 0.01);

        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);

        // DOWNCASTING
       // ContaComercial contaComercial1 = (ContaComercial) conta5;
        if (conta4 instanceof ContaComercial) {
            System.out.println("Conta Comercial !");
        }

        if (conta4 instanceof Poupanca) {
            System.out.println("Poupança");
        }


        Conta x = new Conta(1020,"Alex",1000);
        Conta y = new Poupanca(1023,"Maria",1000,0.01);

        x.retirada(50);
        y.retirada(50);

        System.out.println("Conta: "+ x.getSaldo());
        System.out.println("Poupança: " + y.getSaldo());



    }
}
