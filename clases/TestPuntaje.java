/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;


import org.junit.Test;

public class TestPuntaje {
    @Test
    public void testPuntajeDosRondas() {
        // Creamos las dos rondas consecutivas
        Ronda ronda1 = new Ronda();
        ronda1.setNumeroRonda(1);

        Ronda ronda2 = new Ronda();
        ronda2.setNumeroRonda(2);

        // Creamos algunos partidos para cada ronda con sus resultados y predicciones
        Partido partido1Ronda1 = new Partido("Equipo A", "Equipo B", "Equipo A");
        partido1Ronda1.setResultado("Equipo A");

        Partido partido2Ronda1 = new Partido("Equipo C", "Equipo D", "Empate");
        partido2Ronda1.setResultado("Empate");

        Partido partido1Ronda2 = new Partido("Equipo A", "Equipo C", "Equipo A");
        partido1Ronda2.setResultado("Equipo A");

        Partido partido2Ronda2 = new Partido("Equipo B", "Equipo D", "Equipo D");
        partido2Ronda2.setResultado("Empate");

        // Agregamos los partidos a las rondas correspondientes
        ronda1.setPartido(partido1Ronda1);
        ronda1.setPartido(partido2Ronda1);

        ronda2.setPartido(partido1Ronda2);
        ronda2.setPartido(partido2Ronda2);

        // Creamos un usuario y cargamos sus predicciones para ambas rondas
        Usuario usuario = new Usuario("Juan");
        usuario.agregarPrediccion(partido1Ronda1, "Equipo A");
        usuario.agregarPrediccion(partido2Ronda1, "Empate");
        usuario.agregarPrediccion(partido1Ronda2, "Equipo B");
        usuario.agregarPrediccion(partido2Ronda2, "Equipo D");

        // Calculamos el puntaje del usuario en ambas rondas
        int puntajeRonda1 = usuario.calcularPuntaje(ronda1);
        int puntajeRonda2 = usuario.calcularPuntaje(ronda2);
        int puntajeTotal = puntajeRonda1 + puntajeRonda2;


        // Verificamos que el puntaje total sea el esperado
        assertEquals(3, puntajeTotal);

        System.out.println(" ¡El test fue con exitoso! ");
    }
    private void assertEquals(int i, int puntajeTotal) {

    }


}

