/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package entrega3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LectorArchivos{

    public static void main(String[] args) throws IOException {
        String[] resultUsuario = new String[8]; // arreglo con los ganadores pronosticados por el usuario

        int puntosUs = 0; // variable para dar puntaje al usuario
        String cadenaX = "X"; // cadena para comparar en la lectura del archivo CSV
        String rutaPronostico = "C:/Users/Administrator/Desktop/Proyectos_Java_Etapa1-Entrega_2/pronosticoE2.csv"; // ruta del archivo de pronóstico
        String rutaResultados = "C:/Users/Administrator/Desktop/Proyectos_Java_Etapa1-Entrega_2/resultados.csv"; // ruta del archivo de resultados

        //Lector de archivo PRONOSTICO
        try (BufferedReader lector1 = new BufferedReader(new FileReader(rutaPronostico))) {
            String linea1;

            int cont1 = 0;
            System.out.println("------------ PRONÓSTICO RONDA 1 ------------\n");
            while ((linea1 = lector1.readLine()) != null) {
                String[] partes1 = linea1.split(","); // le indicamos el tipo de separador "," por ser tipo csv
                String nombre = partes1[0];
                String Equipo1Us = partes1[1];
                String GanaE1 = partes1[2];
                String Empates = partes1[3];
                String GanaE2 = partes1[4];
                String Equipo2Us = partes1[5];

                System.out.print("El usuario " + nombre + " para el partido (" + Equipo1Us + " - " + Equipo2Us + ") pronostica que : ");
                if (cadenaX.equals(GanaE1)) {
                    System.out.println(Equipo1Us + " gana");
                    resultUsuario[cont1] = Equipo1Us;
                } else {
                    if (cadenaX.equals(GanaE2)) {
                        System.out.println(Equipo2Us + " gana");
                        resultUsuario[cont1] = Equipo2Us;
                    } else {
                        if (cadenaX.equals(Empates)) {
                            System.out.println("Empate");
                            resultUsuario[cont1] = "Empate";
                            //cont1;
                        }
                    }
                }
                cont1++;
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de pronóstico");
            return;
        }

        //Lector de archivo RESULTADOS
        String[] resultUsuario1 = new String[5];
        String[] resultUsuario2 = new String[5];
        int puntajeUs1 = 0;
        int puntajeUs2 = 0;
        try (BufferedReader lector2 = new BufferedReader(new FileReader(rutaResultados))) {
            String[] resultOficial = new String[4]; // arreglo con los ganadores oficiales
            String linea2;
            int cont2 = 0;
            System.out.println(" \n");
            System.out.println("------------ RESULTADOS RONDA 1 ------------\n");
            while ((linea2 = lector2.readLine()) != null) {
                String[] partes2 = linea2.split(","); // le indicamos el tipo de separador "," por ser tipo csv
                int ronda = 0;
                String Equipo1 = "";
                int GolesE1 = 0;
                int GolesE2 = 0;
                String Equipo2 = "";

                try {
                    ronda = Integer.parseInt(partes2[0]);
                    Equipo1 = partes2[1];
                    GolesE1 = Integer.parseInt(partes2[2]);
                    GolesE2 = Integer.parseInt(partes2[3]);
                    Equipo2 = partes2[4];
                } catch (NumberFormatException e) {
                    System.out.println("Se produjo una excepción: " + e.getMessage());
                    // Aquí puedes agregar el código para manejar la excepción, como imprimir un mensaje de error,
                    // omitir la línea que causó el error, etc.
                    continue; // Este comando permite saltar a la siguiente iteración del bucle while
                }

                // arreglo donde se guardan los resultados para comparar con los pronosticos
                if (GolesE2 == GolesE1) {
                    System.out.println("Resultado del partido: Empate");
                    resultOficial[cont2] = "Empate";
                } else {
                    if (GolesE2 > GolesE1) {
                        System.out.println("Resultado del partido: " + Equipo2 + " ganó");
                        resultOficial[cont2] = Equipo2;
                    } else {
                        if (GolesE1 > GolesE2) {
                            System.out.println("Resultado del partido: " + Equipo1 + " ganó");
                            resultOficial[cont2] = Equipo1;
                        }

                    }
                }
            }

            System.out.println("  ");

            int var = 7 - cont2;
            resultUsuario1[cont2] = resultUsuario[cont2];
            resultUsuario2[cont2] = resultUsuario[var];

            if (resultUsuario1[cont2].equals(resultOficial[cont2])) {
                puntajeUs1++;
                System.out.println("Los datos ingresados por el usuario Mariana coinciden, pronosticó " + resultUsuario1[cont2] + " ---- Suma 1 punto, en total tiene: " + puntajeUs1 + " puntos.");
            } else {
                System.out.println("Los datos ingresados por el usuario Mariana, NO coinciden ");
            }

            if (resultUsuario2[cont2].equals(resultOficial[cont2])) {
                puntajeUs2++;
                System.out.println("Los datos ingresados por el usuario Pedro coinciden, pronosticó " + resultUsuario2[cont2] + " ---- Suma 1 punto, en total tiene: " + puntajeUs2 + " puntos.");

            } else {
                System.out.println("Los datos ingresados por el usuario Pedro, NO coinciden ");
            }
            System.out.println("  ");

            cont2++;
        }
    }



}
