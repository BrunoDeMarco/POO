import java.util.ArrayList;

public class ControladorAluno {
    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public static void addAluno(Aluno aluno){
        if(!alunos.contains(aluno)){
            alunos.add(aluno);
        }
    }

    public static void removeAluno(Aluno aluno){
        if(alunos.contains(aluno)){
            alunos.remove(aluno);
        }
    }

    public static Aluno buscaAluno(int matricula){
        for(Aluno aluno : alunos){
            if(aluno.getMatricula() == matricula){
                return aluno;
            }
        }
        return null;
    }

    public static Aluno buscaAluno(String cpf){
        for(Aluno aluno : alunos){
            if(aluno.getCpf().equals(cpf)){
                return aluno;
            }
        }
        return null;
    }

    public static Aluno buscaAluno(String cpf, Curso curso){
        for(Aluno aluno : alunos){
            if(aluno.getCpf().equals(cpf) && aluno.getCurso() == curso){
                return aluno;
            }
        }
        return null;
    }

    public static Aluno buscaAluno(String nome, Disciplina disciplina){
        for(Aluno aluno : alunos){
            if(aluno.getNome().equals(nome) && aluno.getDisciplinas().contains(disciplina)){
                return aluno;
            }
        }
        return null;
    }
}
