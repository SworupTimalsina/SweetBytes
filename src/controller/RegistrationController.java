package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import view.*;
import model.*;
import Regulations.RegistrationPageRegulation;
import Database.MyConnector;


public class RegistrationController {
    RegistrationModel model;
    RegistrationView view;
    ResultSet rs;
    Statement stmt;
    Connection conn;
    RegistrationPageRegulation checkCreds;
    
    public RegistrationController(RegistrationView view){
        System.out.println("RegistrationController class created");
        this.view=view;
        new RegistrationListener().actionPerformed();
    }
    class RegistrationListener {
        public void actionPerformed() {
            System.out.println("Function Controller's actionPerformed");
            try{
                System.out.println("Try statement of actionPerformed");
                model=view.setNewUser();
                
                checkCreds=new RegistrationPageRegulation(model);
                String checkCredsResult=checkCreds.CheckRegistrationPageRegulation();
                if(checkCredsResult.equals("ok")){
                    view.displayMessage("User Registered");
                    InsertRegistrationData();
                }
                else{
                    System.out.println("else statement of actionPerformed");
                    view.displayMessage(checkCredsResult);
                }
            }
            catch(Exception e1){
                System.out.println("Exception message of RegistrationListener"+e1);
            }
        }
        
        private boolean InsertRegistrationData() {
            try{
                System.out.println("Try statement of InsertRegistration");
                conn=MyConnector.dbConnect();
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
}

