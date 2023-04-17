import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] resultUsuario = new String[2]; // arreglo con los ganadores pronosticados por el usuario
        String[] resultOficial = new String[2]; // arreglo con los ganadores oficiales
        int puntosUs = 0; // variable para dar puntaje al usuario
        String cadenaX = "x"; // cadena para comparar en la lectura del archivo CSV
        String rutaPronostico = "C:/Users/Administrator/Desktop/TP12/out/production/TP12/pronostico.csv"; // ruta del archivo de pronóstico
        String rutaResultados = "C:/Users/Administrator/Desktop/TP12/out/production/TP12/resultados.csv"; // ruta del archivo de resultados
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = leer1.nextLine();


        //Lector de archivo PRONOSTICO
        try (BufferedReader lector1 = new BufferedReader(new FileReader(rutaPronostico))) {
            String linea1;
            int cont1 = 0;
            System.out.println("PRONÓSTICO RONDA 1");
            while ((linea1 = lector1.readLine()) != null) {
                String[] partes1 = linea1.split(","); // le indicamos el tipo de separador "," por ser tipo csv
                String Equipo1Us = partes1[0];
                String GanaE1 = partes1[1];
                String Empates = partes1[2];
                String GanaE2 = partes1[3];
                String Equipo2Us = partes1[4];

                System.out.print("El usuario para el partido (" + Equipo1Us + " - " + Equipo2Us + ") pronostica que : ");
                if (cadenaX.equals(GanaE1)) {
                    System.out.println(Equipo1Us + " gana");
                    resultUsuario[cont1] = Equipo1Us;
                } else if (cadenaX.equals(GanaE2)) {
                    System.out.println(Equipo2Us + " gana");
                    resultUsuario[cont1] = Equipo2Us;
                } else {
                    System.out.println("Empate");
                    resultUsuario[cont1] = "Empate";
                }

                cont1++;
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo de pronóstico");
            return;
        }

        //Lector de archivo RESULTADOS
        try (BufferedReader lector2 = new BufferedReader(new FileReader(rutaResultados))) {
            String linea2;
            int cont2 = 0;
            System.out.println("RESULTADOS RONDA 1");
            while ((linea2 = lector2.readLine()) != null) {
                String[] partes2 = linea2.split(","); // le indicamos el tipo de separador "," por ser tipo csv
                String Equipo1 = partes2[0];
                int GolesE1 = Integer.parseInt(partes2[1]);
                int GolesE2 = Integer.parseInt(partes2[2]);
                String Equipo2 = partes2[3];
                int puntaje = 0;
                String rutaPuntaje = "C:/Users/Administrator/Desktop/TP12/out/production/TP12/puntaje.csv";
                java.io.FileWriter writer = new java.io.FileWriter(rutaPuntaje, true); // se agrega archivo csv
                // Escribir el nombre del usuario y su puntaje en el archivo CSV
                writer.append(nombre + "," + puntosUs + "\n");

// Cerrar el //objeto FileWriter
                writer.close();

                System.out.print("El resultado para el partido (" + Equipo1 + " - " + Equipo2 + ") es : ");
                if (resultUsuario[cont2].equals(Equipo1) && GolesE1 > GolesE2) {
                    System.out.println("Ganó " + Equipo1 + " y acertaste");
                    puntaje++;
                } else if (resultUsuario[cont2].equals(Equipo2) && GolesE2 > GolesE1) {
                    System.out.println("Ganó " + Equipo2 + " y acertaste");
                    puntaje++;
                } else if (resultUsuario[cont2].equals("Empate") && GolesE1 == GolesE2) {
                    System.out.println("Empate y acertaste");
                    puntaje++;
                } else {
                    System.out.println("Fallaste");
                }

                }
            }
        }
    }
