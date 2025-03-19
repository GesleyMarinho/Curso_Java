package PacoteAulasBancoDeDadosJDBC.Aula212;

import java.io.*;
import java.util.*;

class Vendedor {
    private String nome;
    private String email;
    private String dataNascimento;
    private double salario;
    private int departamentoId;

    public Vendedor(String nome, String email, String dataNascimento, double salario, int departamentoId) {
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
        this.departamentoId = departamentoId;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public double getSalario() {
        return salario;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "Nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", DataNascimento='" + dataNascimento + '\'' +
                ", Salario=" + salario +
                ", DepartamentoId=" + departamentoId +
                '}';
    }


    public static List<Vendedor> LeituraArquivo() {

        String path = "C:\\Users\\gesley.marinho\\Desktop\\Curso\\vendedores.txt";

        List<Vendedor> vendedores = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line ;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if(fields.length == 5) {
                    Vendedor vendedor = new Vendedor(
                            fields[0].trim(),
                            fields[1].trim(),
                            fields[2].trim(),
                            Double.parseDouble(fields[3].trim()),
                            Integer.parseInt(fields[4].trim())
                    );
                    vendedores.add(vendedor);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  vendedores;
    }
}
