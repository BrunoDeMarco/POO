import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public abstract class Disciplina {
    public static final int MAX_ALUNOS = 25;
    private static final int NOME_MIN_LEN = 4;
    public final int id;
    private String nome;
    private int creditos;

    public Disciplina(int id, String nome, int creditos) {
        this.id = id;
        this.nome = nome;
        this.creditos = creditos;
    }

    public abstract void definirNotas();

    public int getCreditos() { return this.creditos; }

    public void setCreditos(int creditos){
        this.creditos = creditos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (nome.length() >= Disciplina.NOME_MIN_LEN) {
            this.nome = nome;
        } else {
            System.out.println("O nome informado possui menos de " + Disciplina.NOME_MIN_LEN + " caracteres.");
        }
    }

    public int getId() {
        return id;
    }

    //public boolean addAluno(Aluno aluno) {
      //  alunos.add(aluno);
        //aluno.disciplinas.add(this);
        //return true;
    //}

    /*public boolean removeAluno(Aluno aluno) {
        alunos.remove(aluno);
        aluno.disciplinas.remove(this);
        return true;
    }*/

    /*public void imprimeDados() {
        String resp = this.nome + "(" + this.id + ")\n";
        int i = 0;

        for (Aluno aluno : alunos) {
            if (i == 0) {
                resp += "[" + aluno.getMatricula();
            } else {
                resp += ", " + aluno.getMatricula();
            }
            i++;
        }
        resp += "]";

        System.out.println(resp);
    }*/

}
