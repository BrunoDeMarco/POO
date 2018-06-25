import java.util.ArrayList;

public class RepositorioDeDisciplinas {
    private static ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public static void addDisciplina(Disciplina disciplina){
        if(!disciplinas.contains(disciplina)){
            disciplinas.add(disciplina);
        }
    }

    public static void removeDisciplina(Disciplina disciplina){
        if(disciplinas.contains(disciplina)){
            disciplinas.remove(disciplina);
        }
    }

    public static Disciplina buscarDisciplina(String nome){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getNome().equals(nome)){
                return disciplina;
            }
        }
        return null;
    }

    public static Disciplina buscarDisciplina(int id){
        for(Disciplina disciplina : disciplinas){
            if(disciplina.getId() == id){
                return disciplina;
            }
        }
        return null;
    }
}
