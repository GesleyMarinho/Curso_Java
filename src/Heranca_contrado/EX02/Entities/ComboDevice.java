package Heranca_contrado.EX02.Entities;

import Heranca_contrado.EX02.Interface.Printer;
import Heranca_contrado.EX02.Interface.Scanner;

public class ComboDevice extends Device implements Scanner,Printer{


    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo processing " + doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("Combo printing: "+ doc);
    }

    @Override
    public String scan() {
        return "Combo Scan result ";
    }

    @Override
    public String nextLine() {
        return "";
    }
}
