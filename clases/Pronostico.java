/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;


import java.util.List;

public class Pronostico {
    private String nombre;
    private entrega3.Partido jugado;
    private String ganador;

    public Pronostico() {

    }

    public Pronostico(entrega3.Partido jugado, String ganador, String nombre) {
        this.jugado = jugado;
        this.ganador = ganador;
        this.nombre = nombre;

    }

    public entrega3.Partido getJugado() {
        return jugado;
    }

    public void setJugado(entrega3.Partido jugado) {
        this.jugado = jugado;
    }

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String mostrarDatos() {
        return nombre + "," + ganador + "\n";
    }

    public List<Pronostico> generarPronosticos(List<entrega3.Partido> partidos) {
        return null;
    }

    public Object getEquipoLocal() {
        return null;
    }

    public Object getEquipoVisitante() {
        return null;
    }
}

