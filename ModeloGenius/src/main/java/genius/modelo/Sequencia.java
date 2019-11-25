package genius.modelo;

import java.util.ArrayList;
import java.util.Random;

public class Sequencia {
    private ArrayList<Integer> sequencia = new ArrayList<>();
    private int indice;
    private Random gerador = new Random();
    public Sequencia(){
        this.indice = 0;
    }
    public void  geraSequencia(){
        while(this.sequencia.size()!=0){
            this.sequencia.remove(this.sequencia.size()-1);
        }
        for(int i = 0; i<8;i++){
            this.sequencia.add(gerador.nextInt(4));
        }
    }
    public void ImprimeSequencia(){
        for(int i = 0; i<8;i++){
            System.out.println(this.sequencia.get(i));
            
        }
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice() {
        this.indice++;
    }

    public ArrayList<Integer> getSequencia() {
        return sequencia;
    }
    public void zeraIndice() {
        this.indice = 0;
    }
            
}
