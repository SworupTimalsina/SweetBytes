/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import view.*;
import model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ReviewwController {
    ReviewVieww view;
    ReviewwModel model;
    Connection conn;
    PreparedStatement pst  = null;
    
    public ReviewwController(ReviewVieww view) {
        this.view=view;
        view.updateDB();
    
    }
    
    public void connectionDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sb", "root", "Ranapurnima123$$");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error in connection"+e.getMessage());
        }
    }
    
    public void actionPerformedadd (ReviewwModel model, ReviewVieww view) {
        try {
                if(addreview(model)) {
                    view.setMessage("Review Added Sucessfully!!");
                }
                else {
                    view.setMessage("Couldn't add the review!");
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage()); 
            }
    }
    
    public boolean addreview (ReviewwModel user) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project_sb", "root", "Ranapurnima123$$");
            pst = conn.prepareStatement("INSERT INTO review(Review) VALUES (?)");

            pst.setString(1, view.txtreview.getText());
//            JOptionPane.showMessageDialog(null, "Review Added Successfully!!");
            pst.executeUpdate();
            
            view.updateDB();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error in Connection");

        }
        return true;
    }
    
    
    
    public void actionPerformedclear (ReviewwModel model, ReviewVieww view) {
        view.txtreview.setText("");
    }
}
