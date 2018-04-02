public class Principal {
    //Neste caso, optei por utilizar o gerador de matrículas na página principal, pois, na minha concepção, alunos e funcionários não podem ter o mesmo número de matrícula para terem geradores em suas respectivas classes.+
    static int matricula = 0;
    public static void main(String[] args){
        //Instanciando 3 alunos
        Aluno alunoAtivo = new Aluno(Aluno.ATIVO, geraMatricula(), "Ativo", "47543907844", 1);
        Aluno alunoInativo = new Aluno(Aluno.INATIVO, geraMatricula(), "Inativo", "47543907844", 1);
        Aluno alunoSuspenso = new Aluno(Aluno.SUSPENSO, geraMatricula(), "Suspenso", "47543907844", 1);

        //Testando alunos
        alunoAtivo.imprimeDados();
        alunoInativo.imprimeDados();
        alunoSuspenso.imprimeDados();
        if(alunoAtivo.getMatricula() == alunoInativo.getMatricula() || alunoAtivo.getMatricula() == alunoSuspenso.getMatricula() || alunoInativo.getMatricula() == alunoSuspenso.getMatricula()){
            System.out.println("ERRO: MATRICULAS IGUAIS");
            //Interrompe a execução pois houve um erro.
            return;
        }

       //Instanciando 3 funcionarios
        Funcionario funcionario1 = new Funcionario(geraMatricula(), "Ricardo", "58212347510");
        Funcionario funcionario2 = new Funcionario(geraMatricula(), "Ricardo", "58212347510");
        Funcionario funcionario3 = new Funcionario(geraMatricula(), "Ricardo", "58212347510");

        //Testando funcionarios
        funcionario1.imprimeDados();
        funcionario2.imprimeDados();
        funcionario3.imprimeDados();
        if(funcionario1.getMatricula() == funcionario2.getMatricula() || funcionario1.getMatricula() == funcionario2.getMatricula() || funcionario2.getMatricula() == funcionario3.getMatricula()){
            System.out.println("ERRO: MATRÍCULAS IGUAIS.");
        }
    }

    public static int geraMatricula(){
        return matricula++;
    }
}
