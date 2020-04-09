package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Auria Sonda
 */
public class Conexion {
    private Connection conexion;
    private final String url = "jdbc:mysql://localhost:3306/dyjamir?zeroDateTimeBehavior=convertToNull";
    private final String user = "root";
    private final String password = "";
    
    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, user, password);
            System.out.println("Conectando a la bd...");
            
        } catch(ClassNotFoundException | SQLException ex) {
            System.out.println(" Error no se ha establecido la conexión: ");
            System.out.println(" " + ex.getMessage() + "\n" + ex.getCause() + "\n" + ex.toString());
        }
        
        return conexion;
    }
    
    public static void main (String []args) {
        Conexion con = new Conexion();
        con.getConexion();
    }
}
