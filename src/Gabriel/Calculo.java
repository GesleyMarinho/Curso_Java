package Gabriel;

import javax.swing.JOptionPane;

public class Calculo {

    double Adicao(double numA, double numB) {

        return(numA+numB);
    }
    double Subtracao(double numA, double numB) {

        return(numA-numB);
    }
    double Multiplicacao(double numA, double numB) {

        return(numA*numB);
    }
    double Divisao(double numA, double numB) {

        return(numA/numB);
    }
    double Porcentagem(double numA, double numB) {
        double percente;
        percente = (numA*numB)/100;
        return(percente);
    }
    double Potencia(double numA, double numB) {

        return(Math.pow(numA,numB));
    }
    double RaizQuadrada(double numA) {

        return(Math.sqrt(numA));
    }
    double RestoDiv(double numA, double numB) {

        return(numA%numB);
    }
}

