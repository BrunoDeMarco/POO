import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Professor extends Funcionario {
    private int[] disciplinas;
    private ArrayList<AlunoPos> orientandos = new ArrayList<AlunoPos>();

    public Professor(int matricula, String nome, String cpf, double salario, int... disciplinas){
        super(matricula, nome, cpf, salario);
        int i = 0;
        this.disciplinas = new int[disciplinas.length];
        for(int disciplina : disciplinas){
            this.disciplinas[i] = disciplina;
            i++;
        }
    }

    public Professor(int matricula, String nome, String cpf, double salario, AlunoPos orientando, int... disciplinas){
        super(matricula, nome, cpf, salario);
        int i = 0;
        this.disciplinas = new int[disciplinas.length];
        for(int disciplina : disciplinas){
            this.disciplinas[i] = disciplina;
            i++;
        }
        orientandos.add(orientando);
    }

    public int[] getDisciplinas(){
        return this.disciplinas;
    }

    public void setDisciplinas(int[] disciplinas){
        int i = 0;
        for(int disciplina : disciplinas){
            this.disciplinas[i] = disciplina;
            i++;
        }
    }

    public void imprimirDadosProfessor(){
        super.imprimeDadosFuncionario();
        String saida = "Disciplinas:" + Arrays.toString(disciplinas);
        System.out.println(saida);
    }
}
