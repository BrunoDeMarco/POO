//Bruno de Marco Appolonio - RA195036

import mc302ef.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    //Neste caso, optei por utilizar o gerador de matrículas na página principal, pois, na minha concepção, alunos e funcionários não podem ter o mesmo número de matrícula para terem geradores em suas respectivas classes.+
    static int matricula = 0;
    public static void main(String[] args){
        //Manuseando as disciplinas
        String[][] disciplinas = GerenciadorDisciplinas.getDisciplinas();

        ArrayList<Disciplina> disciplinasSalvas = new ArrayList<Disciplina>();
        for(String[] disciplina : disciplinas){
            int idDisciplina = Integer.parseInt(disciplina[0]);
            String nomeDisciplina = disciplina[1];
            Disciplina disc = new Disciplina(idDisciplina, nomeDisciplina);
            int[] matriculasAlunos = GerenciadorDisciplinas.getAlunosPorDisciplina(idDisciplina);
            for(int aluno : matriculasAlunos){
                disc.addAluno(aluno);
            }
            int[] alunosARemover = GerenciadorDisciplinas.getAlunosARemover();
            for(int alunoARemover : alunosARemover){
                disc.removeAluno(alunoARemover);
            }
            disciplinasSalvas.add(disc);
        }

        //Manuseando funcionarios
        GerenciadorFuncionarios gerenciadorFucionarios = new GerenciadorFuncionarios();
        String[] funcionarioInfo;
        String nome, cpf;

        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

        while((funcionarioInfo = gerenciadorFucionarios.getNextFuncionario()) != null){
            nome = funcionarioInfo[GerenciadorFuncionarios.NOME];
            cpf = funcionarioInfo[GerenciadorFuncionarios.CPF];
            Funcionario funcionario = new Funcionario(geraMatricula(), nome, cpf);
            funcionarios.add(funcionario);
        }
    }

    public static int geraMatricula(){
        return matricula++;
    }
}
