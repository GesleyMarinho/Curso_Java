package PacoteAulasVetor.Vector_Alturas;

public class Dados_Pessoas {

    private String nome;
    private Double altura;
    private int idade;

    public Dados_Pessoas(String nome, Double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
