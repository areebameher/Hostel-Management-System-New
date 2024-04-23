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
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-LRAB979\\SQLEXPRESS02:1433; databaseName=Hostel_Management_System;user=areeba;password=cutie");
            JOptionPane.showMessageDialog(null, "Connection Established");
            return con;
            
            
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
