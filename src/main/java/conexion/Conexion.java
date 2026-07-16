

package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String SERVIDOR = "DESKTOP-RLQUASS";
    private static final String PUERTO = "1433";
    private static final String BASE_DATOS = "BD_Sistema_de_Gestion_Taller_Mecanico"; // tu nombre real
    private static final String USUARIO = "taller_app";
    private static final String PASSWORD = "Simple123!"; // la que le pusiste

    private static final String URL = "jdbc:sqlserver://" + SERVIDOR + ":" + PUERTO
            + ";databaseName=" + BASE_DATOS
            + ";encrypt=true;trustServerCertificate=true";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}