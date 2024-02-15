package Heranca_contrado.EX02.Program;

import Heranca_contrado.EX02.Entities.ComboDevice;
import Heranca_contrado.EX02.Entities.ConcretePrinter;
import Heranca_contrado.EX02.Entities.ConcreteScanner;

public class Main {
    public static void main(String[] args) {

        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");
        System.out.println();

        ConcreteScanner s = new ConcreteScanner("2020");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());
        System.out.println();


        ComboDevice c = new ComboDevice("3030");
        c.processDoc("MY Dissertantion ");
        c.print("My Dissertantion");
        System.out.println("Scan Result: " + c.scan());
    }
}
