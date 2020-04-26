
package logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
     public static Connection startConeccion() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost/sat?user=root&password=mysqladmin";
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conexion Satisfactoria");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
     }
    }
