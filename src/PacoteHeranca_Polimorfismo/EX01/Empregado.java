package PacoteHeranca_Polimorfismo.EX01;

public class Empregado {

    private String nome;
    private Integer horas;
    private double valorHora;

    public Empregado() {
    }

    public Empregado(String nome, Integer horas, double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double Pagamento() {
        return valorHora * horas;
    }
}
