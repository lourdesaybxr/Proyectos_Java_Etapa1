package ap.entrega_2;

/*
 * TRABAJO PRACTICO ENTREGA 2 (GRUPO N°6)
 */



public class Equipo {
    private String nombre;
    private String descripcion;

    public Equipo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
