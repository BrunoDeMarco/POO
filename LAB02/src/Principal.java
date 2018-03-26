public class Principal {
    public static void main(String[] args){
        Aluno alunoAtivo = new Aluno(Aluno.ATIVO, Aluno.idMatricula++, "Bruno", "47543907844", 1);
        Aluno alunoInativo = new Aluno(Aluno.INATIVO, Aluno.idMatricula++, "Bruno", "47543907844", 1);
        Aluno alunoInativo = new Aluno(Aluno.SUSPENSO, Aluno.idMatricula++, "Bruno", "47543907844", 1);

        //Testando um aluno válido
        Aluno aluno = new Aluno(1, "Bruno", "47543907844", 1);
        aluno.imprimeDados();
        //Tentando invalidar a matrícula
        aluno.setMatricula(-5);
        //Tentando invalidar o nome
        aluno.setNome("a");
        //Tentando invalidar o CPF
        aluno.setCpf("12345");
        //Tentando invalidar o curso
        aluno.setCurso(-5);
        //Imprimindo para ter certeza que nada foi alterado
        aluno.imprimeDados();
        //Alterando agora para um valor válido
        aluno.setNome("Rafael");
        aluno.imprimeDados();
        
       //Testando um funcionário válido
        Funcionario funcionario = new Funcionario(2, "Ricardo", "58212347510");
        funcionario.imprimeDados();
        //Tentando invalidar a matrícula
        funcionario.setMatricula(-8);
        //Tentando invalidar o nome
        funcionario.setNome("b");
        //Tentando invalidar o CPF
        funcionario.setCpf("123456");
        //Imprimindo para ter certeza que nada foi alterado
        funcionario.imprimeDados();
        //Alterando agora para um valor válido
        funcionario.setMatricula(10);
        funcionario.imprimeDados();
    }
}
