import java.util.ArrayList;
import java.util.Collections;

public class MeuArray extends ArrayList<Pessoa> {
    public void ordenar(){
        for(int i = 0; i < this.size(); i++){
            for(int j = i + 1;j < this.size();j++){
                if(this.get(i).getNome().compareToIgnoreCase(this.get(j).getNome()) > 0){
                    Collections.swap(this, i, j);
                }
            }
        }
    }

    public void imprimirDados(Aluno aluno){
        aluno.imprimeDadosAluno();
    }

    public void imprimirDados(Professor professor){
        professor.imprimirDadosProfessor();
    }

    public void imprimirDados(Funcionario funcionario){
        funcionario.imprimeDadosFuncionario();
    }
}
