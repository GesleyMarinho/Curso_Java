package Heranca_contrado.EX02.Entities;

import Heranca_contrado.EX02.Interface.Scanner;

public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan() {
        return "Scan content";
    }
}
