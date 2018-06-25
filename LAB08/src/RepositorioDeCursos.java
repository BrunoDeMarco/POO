import java.util.ArrayList;

public class RepositorioDeCursos {
    private static ArrayList<Curso> cursos = new ArrayList<Curso>();

    public static void addCurso(Curso curso){
        //Verificando se o curso sugerido já está instanciado
        boolean achou = false;
        for(Curso curso1 : cursos){
            if(curso1.getCodigo() == curso.getCodigo()){
                achou = true;
            }
        }
        if(!achou){
            cursos.add(curso);
        }else{
            System.out.println("O curso já está na lista.");
        }
    }

    public static void removeCurso(Curso curso){
        cursos.remove(curso);
    }


    public static Curso buscarCurso(int id){
        for(Curso curso : cursos){
            if(curso.getCodigo() == id){
                return curso;
            }
        }
        return null;
    }

    public static Curso buscarCurso(String nome){
        for(Curso curso : cursos){
            if(curso.getNome().equals(nome)){
                return curso;
            }
        }
        return null;
    }
}
