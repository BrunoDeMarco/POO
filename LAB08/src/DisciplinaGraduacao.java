import java.util.ArrayList;
import java.util.Random;

public class DisciplinaGraduacao extends Disciplina {
    private ArrayList<AlunoGraduacao> alunos;
    private double[] notasAlunos;

    public DisciplinaGraduacao(int id, String nome, int creditos){
        super(id, nome, creditos);
        alunos = new ArrayList<AlunoGraduacao>();
    }

    @Override
    public void definirNotas() {
        int i = 0;
        Random random = new Random();
        for(Aluno aluno : alunos){
            notasAlunos[i] = random.nextInt(10 + 1);
            i++;
        }
    }
}
