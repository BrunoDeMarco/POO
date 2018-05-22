import java.util.ArrayList;

public class RepositorioDeCursos {
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

    public void addCurso(Curso curso){
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

    public void removeCurso(Curso curso){
        cursos.remove(curso);
    }
}
