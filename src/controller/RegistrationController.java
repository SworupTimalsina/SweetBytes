package controller;

import java.sql.Connection;
import java.sql.DriverManager;

import view.*;
import model.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Allan
 */

public class RegistrationController {
    RegistrationModel model;
    RegistrationView view;
    ResultSet rs;
    Statement stmt;
    Connection conn=MyConnector.dbConnect();
    
    public RegistrationController(RegistrationView view){
        System.out.println("Registration class created");
        this.view=view;
        view.addRegistrationListner(new RegistrationListener());
    }
    class RegistrationListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Function Controller's actionPerformed");
            try{
                System.out.println("Try statement of actionPerformed");
                model=view.setNewUser();
                if(false){
                    view.displayMessage("Username already exists");
                }
                else{
                    System.out.println("else statement of actionPerformed");
                    if (InsertRegistrationData()){
                        view.displayMessage("Registered successfully");
                        
                    }
                    else{}
                }
            }
            catch(Exception e1){}
        }
        private boolean UsernameExists() throws Exception{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sql="select * from creds where u_name='"+model.getUsername()+"'";
            try{
                stmt=conn.createStatement();
                rs=stmt.executeQuery(sql);
                if(rs.next()){
                    return false;
                }
            conn.close();
            }
            catch(Exception e2){
                view.displayMessage(e2.getMessage());
                
            }
            return true;
        }
        private boolean InsertRegistrationData() {
            try{
                System.out.println("Try statement of InsertRegistration");
                Statement stmt=conn.createStatement();
                //String DOB=yearField.getSelectedItem().toString()+"-"+monthField.getSelectedItem().toString()+"-"+dayField.getSelectedItem().toString();
                String sql = "insert into Creds(f_name, l_name, email, DOB, u_name, pass) values('"+model.getFirstName()+"','"+model.getLastName()+"','"+model.getEmail()+"','"+model.getDateOfBirth()+"','"+model.getUsername()+"','"+model.getPassword()+"')";
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

