public class AlunoPos extends Aluno{
    protected boolean isInglesComprovado;
    protected boolean isExameQualificacaoAprovado;

    private Professor orientador;

    public AlunoPos(int matricula, String nome, String cpf, Curso curso, int estado){
        super(matricula, nome, cpf, curso, estado);
    }

    public AlunoPos(int matricula, String nome, String cpf, Curso curso, int estado, Professor orientador){
        super(matricula, nome, cpf, curso, estado);
        this.orientador = orientador;
    }

    @Override
    public char getMedia(){

    }

    public void imprimeDadosAlunoPos(){
        super.imprimeDadosAluno();
        String ingles = isInglesComprovado ? "Tem inglês" : "Não tem inglês";
        String exame = isExameQualificacaoAprovado ? "Tem exame" : "Não tem exame";
        System.out.println(ingles);
        System.out.println(exame);
    }
}
