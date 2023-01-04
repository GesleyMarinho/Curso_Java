package PacoteHeranca_Polimorfismo.EX01;

public class EmpregadoTercerizado extends Empregado {

    private double horaExtra;

    public EmpregadoTercerizado (){

    }

    public EmpregadoTercerizado(String nome, Integer horas, double valorHora, double horaExtra) {
        super(nome, horas, valorHora);
        this.horaExtra = horaExtra;
    }

    public double getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(double horaExtra) {
        this.horaExtra = horaExtra;
    }

    @Override
    public double Pagamento() {
        return super.Pagamento() + (horaExtra * 1.1);
    }
}
