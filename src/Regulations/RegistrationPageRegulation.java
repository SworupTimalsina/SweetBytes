package Regulations;

import java.sql.*;

import model.*;
import Database.MyConnector;


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
        /*
        * main function that checks every regulation.
        * @return "ok" if everything is valid.
        * @return corresponding error message.
        */
        String firstCheck=FieldEmptyCheck(model);
        if (firstCheck.equals("ok")){// Checks if any fields are left empty.
            if (!BothPasswordsMatch(model.getPassword(), model.getConfirmPassword())){// Checks if both passwords match
                return "Passwords does not match";
                }
            else{
                if (!UsernameTaken(model.getUsername())){// Checks if username is taken.
                    return "ok";
                }
                else{
                    return "Username is taken";
                }
            }
        }
        else{
            return firstCheck;
        }
    }
    public String CheckRegistrationPageRegulation(){
        /*
        * main function that checks every regulation.
        * @return "ok" if everything is valid.
        * @return corresponding error message.
        */
        String firstCheck=FieldEmptyCheck();
        if (firstCheck.equals("ok")){
            
        
            if (!BothPasswordsMatch()){
                return "Passwords does not match";
                }

            else{
                if (!UsernameTaken()){
                    return "ok";
                }
                else{
                    return "Username taken";
                }
            }
        }
        else{
            return firstCheck;
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
    
    
    public boolean UsernameTaken(String username1){
        /*
        * Checks if username is taken or not.
        * @return true if taken and false if username is not taken.
        */
        Connection conn = MyConnector.dbConnect();
        String sqlCommand="select * from creds where u_name='"+username1+"'";
        Statement stmt;
        ResultSet rs;
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sqlCommand);
            return rs.next();
            
        }
        catch(Exception e){
            System.out.println("Error in UsernameTaken: "+e);
        }
        return true;
    }
    public boolean UsernameTaken(){
        /*
        * Checks if username is taken or not.
        * @return true if taken and false if username is not taken.
        */
        Connection conn = MyConnector.dbConnect();
        String sqlCommand="select * from creds where u_name='"+model.getUsername()+"'";
        Statement stmt;
        ResultSet rs;
        try{
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sqlCommand);
            return rs.next();
        }
        catch(Exception e){
            System.out.println("Error in UsernameTaken: "+e);
        }
        return true;
    }
    
    public String FieldEmptyCheck(RegistrationModel model){
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
                            if (model.getSecurity().isBlank()){
                                return "Security Question should not be empty";
                            }
                            else{
                                if (model.getAnswer().isBlank()){
                                   return "Security answer should not be empty";
                                }
                                else{
                                    return DateSelected();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public String FieldEmptyCheck(){
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
                               if (model.getSecurity().isBlank()){
                                   return "Security Question should not be empty";
                               }
                               else{
                                   if (model.getAnswer().isBlank()){
                                       return "Security answer should not be empty";
                                   }
                                   else{
                                       return DateSelected();
                                   }
                               }
                            }
                        }
                    }
                }
            }
        }
    }
     
    public String DateSelected(){
        /*
        * Checks if dates are selected or not.
        * @return "ok" if the dates are selected.
        */
        
        String[] date=model.getDateOfBirth().split("-");// year-month-day
        if (!date[0].equals("year")){
            if (!date[1].equals("invalid")){
                if (!date[2].equals("day")){
                    return "ok";
                }
                else{
                    return "day not selected";
                }
            }
            else{
                return "month not selected";
            }
        }
        else{
            return "year not selected";
        }
        
    }
    
    
        
    public static void main(String[] args){}
        
}
    
   
