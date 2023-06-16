package Regulations;

import java.sql.*;

import model.*;
import controller.MyConnector;


public class RegistrationPageRegulation {
    /*
    * A class that validates the user given information.
    */
    RegistrationModel model;
    public RegistrationPageRegulation(){}
    public RegistrationPageRegulation(RegistrationModel model){
        this.model=model;
    }
    
    public String CheckRegistrationPageRegulation(RegistrationModel model){
        if (BothPasswordsMatch(model.getPassword(), model.getConfirmPassword())){
            if (UsernameNotTaken(model.getUsername())){
                return "ok";
            }
            else{
                return "Username is taken";
            }
        }
        else{
            return "Passwords does not match";
        }
    }
    public String CheckRegistrationPageRegulation(){
        if (BothPasswordsMatch(model.getPassword(), model.getConfirmPassword())){
            if (UsernameNotTaken(model.getUsername())){
                return "ok";
            }
            else{
                return "Username is taken";
            }
        }
        else{
            return "Passwords does not match";
        }
    }
    
    
    public boolean BothPasswordsMatch(String password1, String password2){
        /*
        * Checks if both passwords are same or not.
        * @return true if they match and false if they don't match.
        */
        if (password1.equals(password2)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean BothPasswordsMatch(){
        /*
        * Checks if both passwords are same or not.
        * @return true if they match and false if they don't match.
        */
        if (model.getPassword().equals(model.getConfirmPassword())){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public boolean UsernameNotTaken(String username1){
        /*
        * Checks if username is taken or not.
        * @return true if not taken and false if username is taken.
        */
        Connection conn = MyConnector.dbConnect();
        String sqlCommand="select * from creds where u_name='"+username1+"'";
        Statement stmt;
        ResultSet rs;
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sqlCommand);
            return !rs.next();
            
        }
        catch(Exception e){
            System.out.println("Error in UsernameNotTaken: "+e);
        }
        return false;
    }
    public boolean UsernameNotTaken(){
        /*
        * Checks if username is taken or not.
        * @return true if not taken and false if username is taken.
        */
        Connection conn = MyConnector.dbConnect();
        String sqlCommand="selesct * from creds where u_name='"+model.getUsername()+"'";
        Statement stmt;
        ResultSet rs;
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sqlCommand);
            return !rs.next();
        }
        catch(Exception e){
            System.out.println("Error in UsernameNotTaken: "+e);
        }
        return false;
    }
    
    public String FeildEmptyCheck(RegistrationModel model){
        /*
        * Checks if the field are not left empty.
        * @return "ok" if all fields are not left empty.
        * @return corresponding error message.
        */
        if (model.getFirstName().isBlank()){
            return "First name should not be empty";
        }
        else{
            if (model.getLastName().isBlank()){
                return "Last name should not be empty";
            }
            else{
                if (model.getPassword().isBlank()){
                    return "Passworld should not be empty";
                }
                else{
                    if (model.getConfirmPassword().isBlank()){
                        return "Repeat password should not be empty";
                    }
                    else{
                        if (model.getEmail().isBlank()){
                            return "Email should not be empty";
                        }
                        else{
                            return "ok";
                            }
                        }
                    }
                }
            }
        }
    
        public String FeildEmptyCheck(){
        /*
        * Checks if the field are not left empty.
        * @return "ok" if all fields are not left empty.
        * @return corresponding error message.
        */
        if (model.getFirstName().isBlank()){
            return "First name should not be empty";
        }
        else{
            if (model.getLastName().isBlank()){
                return "Last name should not be empty";
            }
            else{
                if (model.getPassword().isBlank()){
                    return "Passworld should not be empty";
                }
                else{
                    if (model.getConfirmPassword().isBlank()){
                        return "Repeat password should not be empty";
                    }
                    else{
                        if (model.getEmail().isBlank()){
                            return "Email should not be empty";
                        }
                        else{
                            if (model.getUsername().isBlank()){
                                return "Username should not be empty";
                            }
                            else{
                                return "ok";
                            }
                        }
                    }
                }
            }
        }
     }
        
        
    public static void main(String[] args){}

}
    
   
