import java.util.ArrayList;

public class ControladorDeMatricula {
    private ArrayList<SolicitacaoDeMatricula> solicitacoes = new ArrayList<SolicitacaoDeMatricula>();

    public void solicitarMatricula(Disciplina disciplina, Aluno aluno){
        solicitacoes.add(new SolicitacaoDeMatricula(disciplina, aluno));
    }

    public void solicitarTudo(){
        for(SolicitacaoDeMatricula soli : solicitacoes){
            int somacreditos = 0;
            for(Disciplina disciplina : soli.aluno.disciplinas){
                somacreditos += disciplina.getCreditos();
            }
            //Condição para colocar o aluno na disciplina
            if(!(somacreditos + soli.disciplina.getCreditos() > soli.aluno.getCurso().getMaxCreditos()) && soli.disciplina.getAlunos().size() < soli.disciplina.MAX_ALUNOS){
                //O metodo na disciplina já coloca a disciplina no aluno.
                soli.disciplina.addAluno(soli.aluno);
            }
        }
        solicitacoes.clear();
    }

    public class SolicitacaoDeMatricula{
        private Disciplina disciplina;
        private Aluno aluno;

        public SolicitacaoDeMatricula(Disciplina disciplina, Aluno aluno){
            this.disciplina = disciplina;
            this.aluno = aluno;
        }
    }
}
