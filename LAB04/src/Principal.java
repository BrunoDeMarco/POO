//Bruno de Marco Appolonio - RA195036

public class Principal {
    //Neste caso, optei por utilizar o gerador de matrículas na página principal, pois, na minha concepção, alunos e funcionários não podem ter o mesmo número de matrícula para terem geradores em suas respectivas classes.+
    private static int matricula = 0;
    public static void main(String[] args){

        //Instanciando 3 alunos
        Aluno aluno1 = new Aluno(geraMatricula(), "Bruno", "475439078440", 1, Aluno.ATIVO);
        Aluno aluno2 = new Aluno(geraMatricula(), "Rafael", "475439078441", 2, Aluno.INATIVO);
        Aluno aluno3 = new Aluno(geraMatricula(), "Gabriel", "475439078442", 3, Aluno.SUSPENSO);

        //Instanciando 3 professores
        Professor professor1 = new Professor(geraMatricula(), "Guido", "12345678910", 2000, 1, 2, 3);
        Professor professor2 = new Professor(geraMatricula(), "Julio", "12345678911", 2100, 4, 5, 6);
        Professor professor3 = new Professor(geraMatricula(), "Anne", "12345678912", 2200, 7, 8, 9);

        //Instanciando 3 funcionários
        Funcionario funcionario1 = new Funcionario(geraMatricula(), "René", "98765432102", 3000);
        Funcionario funcionario2 = new Funcionario(geraMatricula(), "Dagoberto", "98765432101", 4000);
        Funcionario funcionario3 = new Funcionario(geraMatricula(), "Lil Julio", "98765432103", 5000);

        MeuArray meuArray = new MeuArray();
        meuArray.add(aluno1);
        meuArray.add(aluno2);
        meuArray.add(aluno3);
        meuArray.add(professor1);
        meuArray.add(professor2);
        meuArray.add(professor3);
        meuArray.add(funcionario1);
        meuArray.add(funcionario2);
        meuArray.add(funcionario3);

        imprimirPessoas(meuArray);
        meuArray.ordenar();
        imprimirPessoas(meuArray);

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
