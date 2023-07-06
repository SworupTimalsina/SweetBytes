package dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AduMan
 */

import java.sql.*;


import model.*;
import Database.MyConnector;

public class CartDAO {
    
    public static boolean InsertCartData(ItemsModel imodel) {
        /*
        * Inserts the data from cart page to database.
        * @return true if successful.
        * @return false if unsuccessfull with respective error message printed.
        */
        Connection conn=MyConnector.dbConnect();
        
        try{
            Statement stmt=conn.createStatement();
            //String DOB=yearField.getSelectedItem().toString()+"-"+monthField.getSelectedItem().toString()+"-"+dayField.getSelectedItem().toString();
            String sqlCommand = "insert into cart(name, price ,qunatity ,Total ) values('"+imodel.items()+"','"+rmodel.getLastName()+"','"+rmodel.getEmail()+"','"+rmodel.getDateOfBirth()+"','"+rmodel.getUsername()+"','"+rmodel.getPassword()+"','"+rmodel.getSecurity()+"','"+rmodel.getAnswer()+"')";
            stmt.executeUpdate(sqlCommand);
            searchRegistrationData(rmodel);// to assign e_id.
            return true;
        }
        catch(Exception e){
            System.out.println("Error message in InsertRegistrationData: "+e);  
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error in dao.CustomerDAO.InsertRegistrationData().finally: "+e);
            }
        }
        return false;
    }
    
    
    
}
