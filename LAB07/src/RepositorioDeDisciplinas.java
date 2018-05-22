import java.util.ArrayList;

public class RepositorioDeDisciplinas {
    public ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void addDisciplina(Disciplina disciplina){
        if(!disciplinas.contains(disciplina)){
            disciplinas.add(disciplina);
        }
    }

    public void removeDisciplina(Disciplina disciplina){
        if(disciplinas.contains(disciplina)){
            disciplinas.remove(disciplina);
        }
    }

    public Disciplina buscarDisciplina(String nome){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getNome().equals(nome)){
                return disciplina;
            }
        }
        return null;
    }

    public Disciplina buscarDisciplina(int id){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getId() == id){
                return disciplina;
            }
        }
        return null;
    }
}
