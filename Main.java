/*
 * TRABAJO PRACTICO ENTREGA 3 (GRUPO N°6)
 */
package org.example;
import java.io.IOException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/tpi";
            String user = "root";
            String password = "24171809";

            connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            //Realizamos nuestra consulta a la base de datos MYSQL

            ResultSet resultQuery = statement.executeQuery("SELECT * FROM RESULTADOS");

            //Ciclo para iterar el resultQuery y obtenemos nuestras consultas

            while(resultQuery.next()){
                System.out.println
                        ("| RONDA : " + resultQuery.getString("RONDA") +
                        " |Equipo1 : " + resultQuery.getString("EQUIPO1") +
                        " | Equipo2 : " + resultQuery.getString("EQUIPO2") +
                        " |Goles1 : " + resultQuery.getString("GOLES1") +
                        " |Goles2 : " + resultQuery.getString("GOLES2"));
            }
        }

        //Manejamos las expciones

        catch (SQLException sql) {
            System.out.println("Excepcion de tipo: " + sql);
        }

        catch (ClassNotFoundException notFound){
            System.out.println("Excepcion de tipo: " + notFound);
        }
    }
}