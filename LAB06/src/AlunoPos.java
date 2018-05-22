public class AlunoPos extends Aluno{
    protected boolean isInglesComprovado;
    protected boolean isExameQualificacaoAprovado;

    public AlunoPos(int matricula, String nome, String cpf, Curso curso, int estado){
        super(matricula, nome, cpf, curso, estado);
    }
    public void imprimeDadosAlunoPos(){
        super.imprimeDadosAluno();
        String ingles = isInglesComprovado ? "Tem inglês" : "Não tem inglês";
        String exame = isExameQualificacaoAprovado ? "Tem exame" : "Não tem exame";
        System.out.println(ingles);
        System.out.println(exame);
    }
}
