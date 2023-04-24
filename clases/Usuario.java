/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;

public class Usuario {
    String usuario;
    Integer id;

    public Usuario(String nombre) {

    }
    public Usuario(String usuario, Integer id){
        this.usuario = usuario;
        this.id = id;

    }

    public void agregarPrediccion(Partido partido1Ronda1, String Prediccion) {
    }

    public int calcularPuntaje(Ronda ronda1) {
        return ronda1.getNumeroRonda();
    }

}

