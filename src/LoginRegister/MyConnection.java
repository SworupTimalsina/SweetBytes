package LoginRegister;

import java.sql.*;
public class MyConnection {
    public static Connection dbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver name for mysql connector for java//to load the jar file into form
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SweetBytes","root","43a4a53290");

            System.out.println("Connected!");
            return conn;


        }
        catch(Exception e){
            System.out.println("e.getMessage()");
        }
        return null;
    }

}