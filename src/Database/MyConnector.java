
package Database;

import java.sql.*;
import java.sql.DriverManager;

public class MyConnector{
    public static Connection dbConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/SweetBytes","root","43a4a53290");
            System.out.println("Database connected");
            return conn ;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
