package bd;


import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author USRVI-LC2
 */
public class Conexion {
    
    public Connection obtenerConexion() {
        
        Connection conexion = null;
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/duoc", "root", "");
            
            System.out.println("Conexion exitosa!");
            
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return conexion;
        
    }
    
    
    
    
}
