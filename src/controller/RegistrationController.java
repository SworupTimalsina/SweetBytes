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
        this.view=view;
        new RegistrationListener().actionPerformed();
    }
    class RegistrationListener {
        public void actionPerformed() {
            try{
                model=view.setNewUser();
                checkCreds=new RegistrationPageRegulation(model);
                String checkCredsResult=checkCreds.CheckRegistrationPageRegulation();
                if(checkCredsResult.equals("ok")){
                    view.displayMessage("User Registered");
                    CustomerDAO.InsertRegistrationData(model);
                }
                else{
                    view.displayMessage(checkCredsResult);
                }
            }
            catch(Exception e1){
                System.out.println("Exception message of RegistrationListener"+e1);
            }
        }
        
        
    }
}

