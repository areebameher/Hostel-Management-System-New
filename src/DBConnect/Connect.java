package DBConnect;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Connect {
    public static Connection db()
    {
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con;
            con = DriverManager.getConnection("jdbc:sqlserver://Amina-Laptop\\SQLEXPRESS:1433; databaseName=hostel_database;user=amina;password=java;encrypt=true;trustServerCertificate=true;");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
            
            
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
