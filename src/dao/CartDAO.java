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
    
    public static boolean InsertCartData(CartModel camodel) {
        /*
        * Inserts the data from cart page to database.
        * @return true if successful.
        * @return false if unsuccessfull with respective error message printed.
        */
        Connection conn=MyConnector.dbConnect();
        
        try{
            Statement stmt=conn.createStatement();
            //String DOB=yearField.getSelectedItem().toString()+"-"+monthField.getSelectedItem().toString()+"-"+dayField.getSelectedItem().toString();
            String sqlCommand = "insert into cart(name, price ,quantity ,Total ) values('"+camodel.getItems()+"','"+camodel.getPrice()+"','"+camodel.getQuantity()+"','"+camodel.getTotal()+"')";
            stmt.executeUpdate(sqlCommand);
//            searchRegistrationData(imodel);// to assign e_id.
            return true;
        }
        catch(Exception e){
            System.out.println("Error message in InsertCartData: "+e);  
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error in dao.CartDAO.InsertCartData().finally: "+e);
            }
        }
        return false;
    }
    
    public static boolean updateCartData(CartModel camodel){
        /*
        * Updates the conn table.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        
        PreparedStatement preStmt;
        Connection conn = MyConnector.dbConnect();
        
        String sqlCommand="UPDATE cart SET name=?, price=?, quantity=?, Total=? WHERE name=?";
    
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1,camodel.getItems().get(0));
            preStmt.setString(2,camodel.getPrice().get(0));
            preStmt.setString(3,camodel.getQuantity().get(0));
            preStmt.setString(4,camodel.getTotal().get(0));
            preStmt.setString(5,camodel.getItems().get(0));
 
            
            preStmt.execute();
            
            return true;
        }
        catch(Exception e){
            System.out.println("Error in CartDAO.update: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println(" Error in dao.CartDAO.update().finally: "+e);
            }
        }
        return false;
    }  
    
    public static boolean deleteCartData(CartModel camodel){
        /*
        * Deletes a row from the creds table according to the username.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        Connection conn=MyConnector.dbConnect();
        
        String sqlCommand="DELETE FROM cart WHERE name=?";
        
        try{
            preStmt=conn.prepareStatement(sqlCommand);
            preStmt.setString(1, camodel.getItems().get(0));
            preStmt.execute();
            return true;
        }
        catch(Exception e){
            System.out.println("Error in CartDAO.delete: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println(" Error at CartDAO.delete.finally: "+e);
            }
        }
        return false;
    }
    
    
    
}
