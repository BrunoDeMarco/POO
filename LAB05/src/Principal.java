//Bruno de Marco Appolonio - RA195036

import mc302ef.GerenciadorAlunos;

import java.util.ArrayList;

public class Principal {
    //Neste caso, optei por utilizar o gerador de matrículas na página principal, pois, na minha concepção, alunos e funcionários não podem ter o mesmo número de matrícula para terem geradores em suas respectivas classes.+
    private static int matricula = 0;
    public static void main(String[] args){
        testaInclusaoAlunos();
        testaInscricaoEmDisciplinas();
    }

    public static void testaInclusaoAlunos() {
        /*
         * Leitura de informação de alunos e suas instanciações.
         */
        ArrayList<String[]> infoAlunos = GerenciadorAlunos.getListaAlunos();
        String vinculo, nome, cpf;
        int curso;

        for (String[] campo : infoAlunos) {
            vinculo = campo[GerenciadorAlunos.I_VINCULO];
            nome    = campo[GerenciadorAlunos.I_NOME];
            cpf     = campo[GerenciadorAlunos.I_CPF];
            curso   = Integer.parseInt( campo[GerenciadorAlunos.I_CURSO] );

            if (vinculo.equalsIgnoreCase(GerenciadorAlunos.GRADUACAO) ) {
                AlunoGraduacao aluno = new AlunoGraduacao(geraMatricula(), nome, cpf, curso, Aluno.ATIVO);
            } else {
                boolean isIngles = Boolean.parseBoolean(campo[GerenciadorAlunos.I_INGLES_APROVADO]);
                boolean isExame = Boolean.parseBoolean(campo[GerenciadorAlunos.I_INGLES_APROVADO]);

                if (vinculo.equalsIgnoreCase(GerenciadorAlunos.MESTRADO) ) {
                    AlunoMestrado alunoMestrado = new AlunoMestrado(geraMatricula(), nome, cpf, curso, Aluno.ATIVO, isIngles, isExame);
                    alunoMestrado.setIsInglesComprovado(false);
                    alunoMestrado.setIsExameQualificacaoAprovado(false);
                    alunoMestrado.imprimeDadosAlunoPos();
                } else if (vinculo.equalsIgnoreCase(GerenciadorAlunos.DOUTORADO) ) {
                    AlunoDoutorado alunoDoutorado = new AlunoDoutorado(geraMatricula(), nome, cpf, curso, Aluno.ATIVO, isIngles, isExame);
                    alunoDoutorado.setIsExameQualificacaoAprovado(false);
                    alunoDoutorado.setIsInglesComprovado(false);
                    alunoDoutorado.imprimeDadosAlunoPos();
                }
            }

        }
    }

    public static void testaInscricaoEmDisciplinas() {
        ArrayList<String[]> infoAlunos = GerenciadorAlunos.getDisciplinasPorCpfAluno();

        String cpfAluno;
        int idDisciplina;

        for (String[] params : infoAlunos) {
            cpfAluno = params[0];

            for (int i = 1; i < params.length; i++) {
                idDisciplina = Integer.parseInt(params[i]);
                Aluno aluno = new Aluno(geraMatricula(), "Bruno", cpfAluno, 1, Aluno.ATIVO);
                Disciplina disciplina = new Disciplina(idDisciplina, "Disciplina" + idDisciplina);
                disciplina.addAluno(aluno);
            }
        }

    }

    private static void imprimirPessoas(MeuArray array){
        for(Pessoa pessoa : array){
            if(pessoa instanceof Aluno){
                ((Aluno) pessoa).imprimeDadosAluno();
            }else if(pessoa instanceof Professor){
                ((Professor) pessoa).imprimirDadosProfessor();
            }else if(pessoa instanceof Funcionario){
                ((Funcionario) pessoa).imprimeDadosFuncionario();
            }else{
                pessoa.imprimeDados();
            }
        }

    }

    private static int geraMatricula(){
        return matricula++;
    }
}
