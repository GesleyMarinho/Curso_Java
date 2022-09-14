package Oo_dolares;

public class ConversaoDolares {

    public static double precoPagar(double dollar, double qtCompra) {
        return dollar * qtCompra;
    }

    public static double precoDollarSemImpostos(double dollar, double qtCompra) {
        double total = precoPagar(dollar, qtCompra) * 6 / 100;
        return precoPagar(dollar, qtCompra) + total;
    }
}
