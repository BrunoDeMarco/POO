public class Aluno {
    private int matricula;
    private String nome;
    private String cpf;
    private int curso;

    public Aluno(int matricula, String nome, String cpf, int curso){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int matricula) {
        if (matricula > 0) {
            this.matricula = matricula;
        } else {
            System.out.println("Matrícula inválida.");
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        if(nome.length() >= 3){
            this.nome = nome;
        }else{
            System.out.println("Nome inválido");
        }
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        if(cpf.length() == 11){
            this.cpf = cpf;
        }else{
            System.out.println("CPF inválido");
        }
    }

    public int getCurso(){
        return this.curso;
    }

    public void setCurso(int curso){
        if(curso > 0){
            this.curso = curso;
        }else{
            System.out.println("Curso inválido");
        }
    }

    public void imprimeDados(){
        String saida = "#### Aluno\n";
        saida += "Matrícula: " + getMatricula() + "\n";
        saida += "Nome: " + getNome() + "\n";
        saida += "CPF: " + getCpf() + "\n";
        saida += "Curso: " + getCurso() + "\n";
        System.out.println(saida);
    }
}