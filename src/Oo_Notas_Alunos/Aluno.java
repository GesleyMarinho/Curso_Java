package Oo_Notas_Alunos;

public class Aluno {
    public String nome;
    public int nota1;
    public int nota2;
    public int nota3;

    public double NotaAluno() {
        return nota1 + nota2 + nota3;
    }

    public double mediaAluno(){
        if(NotaAluno() < 60){
            return 60 - NotaAluno();
        }else {
            return NotaAluno();
        }
    }


    @Override

    public String toString() {
        return "Aluno{" +
                " nome = '" + nome + '\'' +
                ", nota1 = " + nota1 +
                ", nota2 = " + nota2 +
                ", nota3 = " + nota3 +
                ", Media = " + NotaAluno() +
                '}';
    }
}
