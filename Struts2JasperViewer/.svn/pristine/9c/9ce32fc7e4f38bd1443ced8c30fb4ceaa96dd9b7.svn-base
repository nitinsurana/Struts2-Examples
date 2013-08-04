package actions;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Harsh
 */
public class ConFactory {

    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
