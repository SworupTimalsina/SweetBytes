/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DELL
 */
public class DbConnection {
    public static Connection dbconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbx:mysql://localhost:3306/SweetBytes","root","43a4a53290");
                    
            System.out.println("connected");
            return(conn);
        }
    
    
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;

    }
}
