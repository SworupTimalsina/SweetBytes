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
    public RegistrationController(RegistrationView view)
    {
        this.view=view;
        view.addRegistrationListner(new RegistrationListener());
    }
    class RegistrationListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                model=view.setNewUser();
                if(checkUser(model))
                {
                    view.displayMessage("Username already exists");
                }
                else
                {
                    view.displayMessage("Registered successfully");
                }
            }
            catch(Exception e1)
            {
                
            }

        }
        public boolean checkUser(RegistrationModel user) throws Exception
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Sweetbytes","root","43a4a53290");
            String sql="select * from creds where pname='"+user.getUsername()+"'";
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
        
    }
    
}

