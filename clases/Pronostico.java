package Modelo;

import java.util.List;

public class Pronostico {
    private String nombre;
    private Partido jugado;
    private String ganador;

    public Pronostico() {

    }

    public Pronostico(Partido jugado, String ganador, String nombre) {
        this.jugado = jugado;
        this.ganador = ganador;
        this.nombre = nombre;

    }

    public Partido getJugado() {
        return jugado;
    }

    public void setJugado(Partido jugado) {
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

    public List<Pronostico> generarPronosticos(List<Partido> partidos) {
        return null;
    }

    public Object getEquipoLocal() {
        return null;
    }

    public Object getEquipoVisitante() {
        return null;
    }
}
