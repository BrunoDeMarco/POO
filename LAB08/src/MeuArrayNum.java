import java.util.Collections;

public class MeuArrayNum extends MeuArray {
    //Ordena pela matricula
    @Override
    public void ordenar() {
        for(int i = 0; i < this.size(); i++){
            for(int j = i + 1;j < this.size();j++){
                if(this.get(i).getMatricula() > this.get(j).getMatricula()){
                    Collections.swap(this, i, j);
                }
            }
        }
    }
}