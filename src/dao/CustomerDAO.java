package dao;

import java.sql.Statement;
import java.sql.Connection;

import model.*;
import Database.MyConnector;

public class CustomerDAO {
    public static boolean InsertRegistrationData(RegistrationModel model) {
        /*
        * Inserts the data from registration page to database.
        */
            try{
                System.out.println("Try statement of InsertRegistration");
                Connection conn=MyConnector.dbConnect();
                Statement stmt=conn.createStatement();
                //String DOB=yearField.getSelectedItem().toString()+"-"+monthField.getSelectedItem().toString()+"-"+dayField.getSelectedItem().toString();
                String sql = "insert into creds(f_name, l_name, email, DOB, u_name, pass, securityQ, answer) values('"+model.getFirstName()+"','"+model.getLastName()+"','"+model.getEmail()+"','"+model.getDateOfBirth()+"','"+model.getUsername()+"','"+model.getPassword()+"','"+model.getSecurity()+"','"+model.getAnswer()+"')";
                stmt.executeUpdate(sql);
                return true;
            }
            catch(Exception e){
                System.out.println("Else statement of InsertRegistration");
                System.out.println("Error message in InsertRegistrationData: "+e);
                return false;
            }
        }
}
