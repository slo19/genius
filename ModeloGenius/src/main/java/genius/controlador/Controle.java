package genius.controlador;

import genius.modelo.Sequencia;
import java.util.ArrayList;


public class Controle {

    protected final Sequencia seq;
    private int nivel;

    public Controle() {
        this.nivel = 1;
        this.seq = new Sequencia();

    }

    public int compara(int entrada) {
        if (seq.getSequencia().get(seq.getIndice()) == entrada) {
            if (seq.getIndice() == (this.nivel - 1)) {
                if (this.nivel == 8) {
                    return 3;
                }
                return 2;
            }
            seq.setIndice();
            return 1;
        } else {
            return 0;
        }
    }

    public void zeraIndice() {
        seq.zeraIndice();
        this.nivel ++;
    }

    public void geraSequencia() {
        this.seq.geraSequencia();
    }

    public ArrayList<Integer> getSequencia() {
        return this.seq.getSequencia();
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(){
        this.nivel=1;
    }
   
}
