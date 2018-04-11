import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
    private int id;
    private String nome;
    private int alunos[];

    public static final int MAX_ALUNOS = 25;
    public static int alunosRegistrados = 0;

    public Disciplina(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.alunos = new int[MAX_ALUNOS];
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void imprimeDados(){
        System.out.printf("%s(%d)\n", nome, id);
        System.out.print("[");
        for(int i = 0; i < alunosRegistrados; i++){
            if(i != alunosRegistrados-1){
                System.out.print(alunos[i] + ", ");
            }else{
                System.out.print(alunos[i]);
            }
        }
        System.out.println("]");
    }

    public void addAluno(int matricula){
        //Pelas regras do sistema, não podemos inserir matrículas menores que 1.
        for(int i = 0; i < alunos.length; i++){
            if(matricula <= alunos[i] || alunos[i] == 0){
                for(int j = alunos.length-1; j > i; j--){
                    alunos[j] = alunos[j-1];
                }
                alunos[i] = matricula;
                alunosRegistrados++;
                break;
            }
        }
    }

    public void removeAluno(int matricula){
        boolean found = false;
        for(int i = 0; i < alunosRegistrados; i++){
            if(alunos[i] == matricula){
                for(int j = i; j < alunosRegistrados-1; j++){
                    alunos[j] = alunos[j+1];
                }
                alunosRegistrados--;
            }
        }
    }

}
