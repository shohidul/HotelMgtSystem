
package HotelM;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class JDBC {
Connection con=null;
    public static Connection abc() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmgt", "root", "123");
            return con;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Database connection error!", "Error", JOptionPane.DEFAULT_OPTION);
            return null;
        }
    }
    
}
