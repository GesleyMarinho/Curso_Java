package Heranca_contrado.EX02.Entities;

import Heranca_contrado.EX02.Interface.Printer;

public class ConcretePrinter extends Device implements Printer {
    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }



    @Override
    public void processDoc(String doc) {
        System.out.println("Printing processing: " + doc);
    }

    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
