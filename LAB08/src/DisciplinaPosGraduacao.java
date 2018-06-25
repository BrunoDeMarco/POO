import java.util.ArrayList;
import java.util.Random;

public class DisciplinaPosGraduacao extends Disciplina {
    private ArrayList<Aluno> alunos;
    private char[] notasAlunos;

    public DisciplinaPosGraduacao(int id, String nome, int creditos){
        super(id, nome, creditos);
        alunos = new ArrayList<Aluno>();
    }

    @Override
    public void definirNotas() {
        int i = 0;
        Random random = new Random();
        for(Aluno aluno : alunos){
            int numGerado = random.nextInt(10 + 1 );
            if(numGerado >= 8.5){
                notasAlunos[i] = 'A';
            }else if(numGerado >= 7){
                notasAlunos[i] = 'B';
            }else if(numGerado >= 5){
                notasAlunos[i] = 'C';
            }else{
                notasAlunos[i] = 'D';
            }
            i++;
        }
    }
}
