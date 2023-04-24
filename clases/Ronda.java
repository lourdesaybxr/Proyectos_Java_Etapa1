/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;

public class Ronda {
    private Integer NumeroRonda;
    private entrega3.Partido partido;

    public Ronda() {

    }

    public Ronda(Integer numeroRonda){
        this.NumeroRonda = numeroRonda;

    }


    public Integer getNumeroRonda() {
        return NumeroRonda;
    }

    public void setNumeroRonda(Integer numeroRonda) {
        NumeroRonda = numeroRonda;
    }

    public entrega3.Partido getPartido() {
        return partido;
    }

    public void setPartido(entrega3.Partido partido) {
        this.partido = partido;
    }
}

