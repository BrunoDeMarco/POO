public abstract class Pessoa {
    private int matricula;
    private String nome;
    private String cpf;

    public Pessoa(int matricula, String nome, String cpf){
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
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

    public void imprimeDados(){
        String saida = "\nMatrícula: " + getMatricula() + "\n";
        saida += "Nome: " + getNome() + "\n";
        saida += "CPF: " + getCpf();
        System.out.println(saida);
    }
}
