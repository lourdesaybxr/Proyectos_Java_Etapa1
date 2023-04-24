/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;

public class Partido {
    private String equipo1;
    private String equipo2;
    private Integer golesEquipo1;
    private Integer golesEquipo2;

    public Partido(String equipo1, String equipo2, String campo) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = 0;
        this.golesEquipo2 = 0;
    }

    public Partido(String equipo1, String equipo2, Integer golesEquipo1, Integer golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public Integer getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(Integer golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public Integer getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(Integer golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipoGanador() {
        String equipoGano;
        if (golesEquipo1 < golesEquipo2) {
            equipoGano = equipo2;
        } else if (golesEquipo1 > golesEquipo2) {
            equipoGano = equipo1;
        } else {
            equipoGano = "Empate";
        }
        return equipoGano;
    }

    public String getEquipoLocal() {
        return equipo1;
    }

    public String getEquipoVisitante() {
        return equipo2;
    }

    public void registrarGoles(Integer golesEquipo1, Integer golesEquipo2) {
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

    public void setResultado(String equipoA) {

    }
}
