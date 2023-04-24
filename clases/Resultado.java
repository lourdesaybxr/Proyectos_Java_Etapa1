/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;

public class Resultado {
    private String ganador;
    private String perdedor;
    private String empate;
    private String resultado;


    public Resultado(String ganador, String perdedor, int golesGanador, int golesPerdedor) {
        this.ganador = ganador;
        this.perdedor = perdedor;
        this.resultado = golesGanador + " - " + golesPerdedor;
    }


    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getPerdedor() {
        return perdedor;
    }

    public void setPerdedor(String perdedor) {
        this.perdedor = perdedor;
    }

    public String getEmpate() {
        return empate;
    }

    public void setEmpate(String empate) {
        this.empate = empate;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public Object getEquipoLocal() {
        return null;
    }

    public Object getEquipoVisitante() {
        return null;
    }
}
