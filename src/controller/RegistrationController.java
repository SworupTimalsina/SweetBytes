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
import dao.CustomerDAO;


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
                    CustomerDAO.InsertRegistrationData(model);
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
        
        
    }
}

