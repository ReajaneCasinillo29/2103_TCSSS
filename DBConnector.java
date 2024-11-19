/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Control_Connector;

import com.mysql.cj.protocol.Message;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBConnector {
    private static Connection connect;
    private static DBConnector dbcon;
    
    private static final String url = "jdbc:mysql://localhost:3306/tcsss_2103";
    private static String user = "root";
    private static String password = "pass";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*public DBConnector(){*/
        connect = null;
        
        try{
            connect = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Connection successful", "", 0);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connection failed", "", 0);
        }
        
    }

    public Connection getDBConnector() {
        return connect;
    }
}
    

