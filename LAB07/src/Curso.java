import java.lang.reflect.Array;
import java.util.ArrayList;

public class Curso {

    private int codigo;
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Aluno> alunos;
    private int maxCreditos;

    public Curso(String nome, int codigo, int maxCreditos){
        this.nome = nome;
        this.codigo = codigo;
        this.maxCreditos = maxCreditos;
    }

    public String getNome(){ return this.nome; }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getCodigo(){ return this.codigo; }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getMaxCreditos() { return this.maxCreditos; }

    public void setMaxCreditos(int creditos){
        this.maxCreditos = creditos;
    }

    public boolean matricularAluno(Aluno aluno){
        if(!alunos.contains(aluno)){
            this.alunos.add(aluno);
            return true;
        }else{
            System.out.println("Aluno já contido no curso.");
            return false;
        }
    }

    public void cancelarMatricula(Aluno aluno){
        alunos.remove(aluno);
    }

    public boolean adicionaDisciplina(Disciplina disciplina){
        if(!this.disciplinas.contains(disciplina)){
            this.disciplinas.add(disciplina);
            return true;
        }else{
            System.out.println("Disciplina já contida no curso.");
            return false;
        }
    }

    public void removeDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }
}
