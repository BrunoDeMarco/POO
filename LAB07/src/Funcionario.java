public class Funcionario extends Pessoa{

    private double salario;

    public Funcionario(int matricula, String nome, String cpf, double salario){
        super(matricula, nome, cpf);
        this.salario = salario;
    }

    public double getSalario(){ return this.salario; }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void imprimeDadosFuncionario(){
        super.imprimeDados();
        String saida = "Salário: " + getSalario();
        System.out.println(saida);
    }

}
