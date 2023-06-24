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

public class LoginController {
    LoginModel model;
    LoginView view;
    ResultSet rs;
    Statement stmt;
    Connection conn;
    public LoginController(LoginView view)
    {
        this.view=view;
        
        new LoginListener().actionPerformed();
        
        
    }
    class LoginListener
    {

        public void actionPerformed() {
            try
            {
                model=view.getUser();
                if(checkUser(model))
                {
                    view.setMessage("Login Successfully");
                    
                    DashboardView DBV = new DashboardView();
                    DBV.show();                                
                }
                else
                {
                    view.setMessage("Invalid username or password");
                    
                }
            }
            catch(Exception e1)
            {
                
            }

        }
        public boolean checkUser(LoginModel user) throws Exception
        {
          conn=MyConnector.dbConnect();
          
          String sql="select * from creds where u_name='"+user.getUsername()+"' AND pass='"+user.getPassword()+"'";
          try
          {
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);
             if(rs.next())
             {
                 return true;
             }
             conn.close();
            
          
          }
          catch(Exception e2)
          {
              System.out.println(e2.getMessage());
          }         
            
            return false;
        }
        
    }
  
    
    
}

