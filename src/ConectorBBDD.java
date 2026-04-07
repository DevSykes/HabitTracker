import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectorBBDD {
    private static final String URL = "jdbc:mysql://localhost:3306/gestor_habitos?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            // Esto es lo que usa el .jar que acabamos de añadir
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("¡Conectado a la base de datos de Hábitos!");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}