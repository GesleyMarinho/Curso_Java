package PacoteAulasEspressoesLambadas.EX02;

public class User {
    private String nome;
    private String email;

    private double salary;

    public User(String nome, String email, double salary) {
        this.nome = nome;
        this.email = email;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
