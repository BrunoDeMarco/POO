import com.sun.xml.internal.bind.v2.TODO;

public class AlunoDoutorado extends AlunoPos {

    public AlunoDoutorado(int matricula, String nome, String cpf, Curso curso, int estado, boolean isInglesComprovado, boolean isExameQualificacaoAprovado){
        super(matricula, nome, cpf, curso, estado);
        super.isInglesComprovado = isInglesComprovado;
        super.isExameQualificacaoAprovado = isExameQualificacaoAprovado;
    }

    //TODO: Set rules
    public void setIsInglesComprovado(boolean inglesComprovado){
        super.isInglesComprovado = inglesComprovado;
    }

    //TODO: Set rules
    public void setIsExameQualificacaoAprovado(boolean exameQualificacaoAprovado){
        super.isExameQualificacaoAprovado = exameQualificacaoAprovado;
    }

    public int calculaAnoMaxIntegralizacao(){
        return super.getAnoIngresso() + 6;
    }
}
