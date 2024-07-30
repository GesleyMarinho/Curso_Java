package PacoteSet.EX02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class curso {

    private String nomeCurso;
    private int codigoAluno;

    public curso(int codigoAluno, String nomeCurso) {
        this.codigoAluno = codigoAluno;
        this.nomeCurso = nomeCurso;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        curso curso = (curso) o;
        return codigoAluno == curso.codigoAluno && Objects.equals(nomeCurso, curso.nomeCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCurso, codigoAluno);
    }

    public static Set<curso> dadosAlunos(String path) {
        Set<curso> set = new HashSet<>();
        Set<String> cursosDiferentes = new HashSet<>();


        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();
            while (linha != null) {
                String[] fields = linha.split(" ");

                String nomeCurso = fields[0];
                int codigoAluno = Integer.parseInt(fields[1]);

                set.add(new curso(codigoAluno, nomeCurso));
                cursosDiferentes.add(nomeCurso);


                linha = br.readLine();

            }

            System.out.println("Quantidade de cursos Diferentes: " + cursosDiferentes.size());

            for (curso alunos : set) {
                System.out.println("Curso: " + alunos.getNomeCurso() + " Código do Aluno: " + alunos.getCodigoAluno());
            }
        } catch (IOException e) {
            System.out.println("Erro de exception " + e.getMessage());
            return null;
        }

        return set;
    }
}
