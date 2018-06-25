public class AlunoPos extends Aluno{
    protected boolean isInglesComprovado;
    protected boolean isExameQualificacaoAprovado;
    private char[] notasLetras;
    private char cr;
    private Professor orientador;

    public AlunoPos(int matricula, String nome, String cpf, Curso curso, int estado){
        super(matricula, nome, cpf, curso, estado);
        int i = 0;
        for(int nota : super.getNotas()){
            if(nota >= 8.5){
                this.notasLetras[i] = 'A';
            }else if(nota >= 7){
                this.notasLetras[i] = 'B';
            }else if(nota >= 5){
                this.notasLetras[i] = 'C';
            }else{
                this.notasLetras[i] = 'D';
            }
            i++;
        }
    }

    public AlunoPos(int matricula, String nome, String cpf, Curso curso, int estado, Professor orientador){
        super(matricula, nome, cpf, curso, estado);
        this.orientador = orientador;
    }

    public float getCr(){
        int soma = 0;
        for(char nota : notasLetras){
            switch (nota){
                case 'A':
                    soma += 4;
                    break;
                case 'B':
                    soma += 3;
                    break;
                case 'C':
                    soma += 2;
                    break;
                case 'D':
                    soma += 1;
                    break;
            }
        }
        return soma/notasLetras.length;
    }

    public void imprimeDadosAlunoPos(){
        super.imprimeDadosAluno();
        String ingles = isInglesComprovado ? "Tem inglês" : "Não tem inglês";
        String exame = isExameQualificacaoAprovado ? "Tem exame" : "Não tem exame";
        System.out.println(ingles);
        System.out.println(exame);
    }

    @Override
    public boolean foiAprovado(double nota) {
        return nota >= 5;
    }
}
