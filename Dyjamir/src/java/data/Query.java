package data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Usuarios;

/**
 *
 * @author Auria Sonda 
 */
public class Query {
    private Conexion conexion;
    private Connection connection;
    private int res = 0;
    
    public boolean login(Usuarios users) throws SQLException {
        conexion = new Conexion();
        connection = conexion.getConexion();
        String sql = "select Nombre_Usuario, Contraseña from login where Nombre_Usuario=? and Contraseña=? and Estado=1";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, users.getNombre_usuario());
        statement.setString(2, users.getPassword());
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            res = res + 1;
            users.setNombre_usuario(rs.getString("Nombre_Usuario"));
            users.setPassword(rs.getString("Contraseña"));
            users.setEstado(rs.getInt("Estado"));
        } 
        
        if(res == 1) {
            return true;
        } else {
            return false;
        }
    }
}
