//Bruno de Marco Appolonio - RA195036
import java.util.ArrayList;

public class Principal {
    //Neste caso, optei por utilizar o gerador de matrículas na página principal, pois, na minha concepção, alunos e funcionários não podem ter o mesmo número de matrícula para terem geradores em suas respectivas classes.+
    private static int matricula = 0;

    public static void main(String[] args){
        //Criando um curso com 6 créditos
        //Instanciando o repositorio de cursos
        RepositorioDeCursos repo = new RepositorioDeCursos();
        //Instanciando um curso
        Curso curso = new Curso("Teste", 1, 6);
        //Adicionando o curso ao repo
        repo.addCurso(curso);
        //Instanciando um aluno
        Aluno aluno = new Aluno(geraMatricula(), "Bruno", "47543907844", curso, Aluno.ATIVO);
        //Instanciando disciplinas que somem mais de 6 créditos
        Disciplina d1 = new Disciplina(1, "1", 2);
        Disciplina d2 = new Disciplina(2, "2", 2);
        Disciplina d3 = new Disciplina(3, "3", 3);

        //Instanciando o ControladorDeMatricula
        ControladorDeMatricula controladorDeMatricula = new ControladorDeMatricula();
        controladorDeMatricula.solicitarMatricula(d1, aluno);
        controladorDeMatricula.solicitarMatricula(d2, aluno);
        controladorDeMatricula.solicitarMatricula(d3, aluno);
        controladorDeMatricula.solicitarTudo();

        aluno.imprimeDadosAluno();

        Aluno[] alunos = new Aluno[26];
        for(int i = 0; i < 26; i++){
            alunos[i] = new Aluno(geraMatricula(), Integer.toString(i), "47543907844", curso, Aluno.ATIVO);
        }

        Disciplina disciplina = new Disciplina(4, "4", 6);
        for(Aluno aluno1 : alunos){
            controladorDeMatricula.solicitarMatricula(disciplina, aluno1);
        }
        controladorDeMatricula.solicitarTudo();

        alunos[25].imprimeDadosAluno();
        alunos[24].imprimeDadosAluno();
    }


    private static int geraMatricula(){
        return matricula++;
    }
}
