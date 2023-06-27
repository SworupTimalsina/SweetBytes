package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import model.*;
import view.*;
import view.DashboardView;
import Database.MyConnector;
import dao.CustomerDAO;

public class LoginController {
    LoginModel model;
    LoginView view;
    ResultSet rs;
    Statement stmt;
    Connection conn;
    RegistrationModel rModel;
            
    public LoginController(LoginView view)
    {
        this.view=view;
        
        new LoginListener().actionPerformed();
        
        
    }
    class LoginListener{

        public void actionPerformed() {
            try{
                model=view.getUser();
                if(checkUser(model)){
                    view.setMessage("Login Successfully");
                    DashboardView DBV = new DashboardView(rModel);
                    DBV.show();                                
                }
                else{
                    view.setErrorMessage("Invalid username or password");
                }
            }
            catch(Exception e1){}
        }
        
        
        
        public boolean checkUser(LoginModel user) throws Exception{
            /*
            * Checks if username and password matches with database.
            * @return true if username and password matches with database.
            * @return false if it does not match.
            */
            rModel = new RegistrationModel();
            rModel.setUsername(user.getUsername());
            if (CustomerDAO.searchRegistrationData(rModel) && rModel.getPassword().equals(user.getPassword())){
                return true;
            }
            else{
                return false;
            }
        }
    }
  
    
    
}

