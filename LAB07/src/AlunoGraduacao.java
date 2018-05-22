public class AlunoGraduacao extends Aluno {

    public AlunoGraduacao(int matricula, String nome, String cpf, Curso curso, int estado){
        super(matricula, nome, cpf, curso, estado);
        super.anoLimite = calculaAnoMaxIntegralizacao();
    }

    public void setAnoLimite(){
        super.anoLimite = calculaAnoMaxIntegralizacao();
    }

    public int calculaAnoMaxIntegralizacao(){
        return super.getAnoIngresso() + 7;
    }
}
