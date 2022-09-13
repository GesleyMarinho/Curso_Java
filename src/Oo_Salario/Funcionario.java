package Oo_Salario;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double novoSalario() {

        return salarioBruto - taxa;
    }

    public void incrementoSalario(double percent) {

        this.salarioBruto += (salarioBruto * percent) / 100;

    }

    @Override
    public String toString() {
        return " Funcionario{" + " nome = '" + nome + '\'' + ", Novo Salario = " + novoSalario() + '}';
    }
}
