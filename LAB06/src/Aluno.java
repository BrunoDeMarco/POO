import java.util.ArrayList;
import java.util.Arrays;

public class Aluno extends Pessoa{

    private Curso curso;
    private int estado;
    public ArrayList<Disciplina> disciplinas;
    private int anoIngresso;
    protected int anoLimite;


    //Declaração das variáveis de estado
    public static final int ATIVO = 1;
    public static final int INATIVO = 2;
    public static final int SUSPENSO = 3;

    //Variável da geração de matrículas
    public static int idMatricula = 0;

    public Aluno(int matricula, String nome, String cpf, Curso curso, int estado){
        super(matricula, nome, cpf);
        this.estado = estado;
        this.curso = curso;
        //this.anoIngresso = GerenciadorAlunos.getAnoIngressoRandom();
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public int getAnoIngresso() { return anoIngresso; }

    public Curso getCurso(){
        return this.curso;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }

    public int getEstado() { return this.estado; }


    public void imprimeDadosAluno(){
        super.imprimeDados();
        String saida = "Curso: " + getCurso().getNome() + "\n";
        //Checando qual o estado para atribuir à saída
        switch(getEstado()){
            case ATIVO:
                saida += "Aluno ATIVO";
                break;
            case INATIVO:
                saida += "Aluno INATIVO";
                break;
            case SUSPENSO:
                saida += "Aluno SUSPENSO";
                break;
        }
        System.out.println(saida);
        System.out.println("Disciplinas:");
        for(Disciplina disciplina : disciplinas){
            System.out.println(disciplina.getNome() + " ");
        }
    }
}