/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class ForgotPwdController {
    String Squestion;
    ForgotPwdModel model;
    ForgotpwdView view;
    ResultSet rs;
    Statement stmt;
    Connection conn;
    PreparedStatement pst  = null;
    
    public ForgotPwdController(ForgotpwdView view) {
        this.view=view;
//        new searchListener().actionPerformedsearch(model, view);
//        new ForgotPwdListener().actionPerformedconfirm(model, view);
   }
    
    public ForgotPwdController(){
        
    }
    
//    class searchListener{
    public void actionPerformedsearch(ForgotPwdModel model,ForgotpwdView view) {
            try {
                System.out.println("fetching question........"); 
                model=view.getUser();
                if(checkQuestion(model)) {
                    String Squestion;
                    
                    
//                    System.out.println("fetcing question");
//                    view.setMessage(Squestion);
                    view.setMessage("Provide Correct credentials!!!");
                }
                else {
//                    view.setMessage("Provide Correct credentials!!!");
//                    view.setMessage(Squestion);
                        view.setSquestion(Squestion);
//                                              System.out.println(rs.getString(Squestion));

                      
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        public boolean checkQuestion(ForgotPwdModel user) throws Exception {
             Class.forName("com.mysql.cj.jdbc.Driver");
//             ForgotPwdModel mymodel;
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sb","root","43a4a53290");
             String sql ="select securityQ from forgot_pwd where username='"+user.getUsername()+"'";
             try {
//                  stmt=conn.createStatement();
                  pst=conn.prepareStatement(sql);
                  rs=pst.executeQuery(sql);
                  if(rs.next()) {
                      Squestion=rs.getString("securityQ");
                      
                      
//                      System.out.println(rs.getString(Squestion));
//                      view.setMessage("Testing ");
                      
                      
//                      view.setSquestion(rs.getString(Squestion));
//                      user.setSquestion(Squestion);
                      
                      
//                      model.setText(rs.getString(1));

//                      pst.setString(2, user.getSquestion());
//                      pst.setString(8, user.getSquestion());
//                      pst.executeUpdate();
                      
                      
                  }
                  
//                  if(rs.next())
//                {
//                 return true;
//                }
             conn.close();
        
        
        
//                  while(rs.next()) {
//                      user.setText(rs.getString(1));
//                  }
//                  if (!Squestion.getText().isEmpty)
            
             
             }
             catch(Exception e) {
                 System.out.println(e);
             }
             
             return false;
        }
//    }
        
    
//    class ForgotPwdListener{
        public void actionPerformedconfirm(ForgotPwdModel model,ForgotpwdView view) {
            try {
                if(checkPass(model)) {
                    view.setMessage("Password updated Sucessfully!!");
                }
                else {
                    view.setMessage("Incorrect credentials!");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage()); 
            }
        }
        
        public boolean checkPass (ForgotPwdModel user) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sb","root","43a4a53290");
             String sql="select * from forgot_pwd where username='"+user.getUsername()+"' and answer='"+user.getAnswer()+"'";
            try {
                stmt=conn.createStatement();
                rs=stmt.executeQuery(sql);
                if(rs.next())
                {
                    stmt.executeUpdate("update forgot_pwd set password='"+user.getNpassword()+"' where username='"+user.getUsername()+"' and answer='"+user.getAnswer()+"'");
                    return true;
                }
                conn.close();
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            
            return false;
        }
    }
//}
    
