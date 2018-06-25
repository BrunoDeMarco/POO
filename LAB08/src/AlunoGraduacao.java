public class AlunoGraduacao extends Aluno {
    private float cr;

    public AlunoGraduacao(int matricula, String nome, String cpf, Curso curso, int estado){
        super(matricula, nome, cpf, curso, estado);
        super.anoLimite = calculaAnoMaxIntegralizacao();
        this.cr = super.getMedia();
    }

    public void setAnoLimite(){
        super.anoLimite = calculaAnoMaxIntegralizacao();
    }

    public int calculaAnoMaxIntegralizacao(){
        return super.getAnoIngresso() + 7;
    }

    @Override
    public boolean foiAprovado(double nota) {
        return nota >= 5;
    }
}
