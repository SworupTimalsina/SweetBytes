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
import java.util.ArrayList;

public class CartDAO {
    
    public static boolean insertCartData(CartModel camodel) {
        // Inserts the data from the cart page into the database.
        // Returns true if successful, false otherwise.

        Connection conn = MyConnector.dbConnect();

        try {
            Statement stmt = conn.createStatement();
            ArrayList<String> items = camodel.getItems();
            ArrayList<String> prices = camodel.getPrice();
            ArrayList<String> quantities = camodel.getQuantity();
            ArrayList<String> totals = camodel.getTotal();

            for (int i = 0; i < items.size(); i++) {
                String sqlCommand = "INSERT INTO cart (name, price, quantity, Total) VALUES ('" + items.get(i) + "','" + prices.get(i) + "','" + quantities.get(i) + "','" + totals.get(i) + "')";
                stmt.executeUpdate(sqlCommand);
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error message in insertCartData: " + e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error in dao.CartDAO.insertCartData().finally: " + e);
            }
        }
        return false;
    }
    
        public static boolean insertBdayData(BirthdayCakeModel Bmodel) {
            
            int totalSum = 0;


        Connection conn = MyConnector.dbConnect();

        try {
            Statement stmt = conn.createStatement();
            String caketype = Bmodel.getCaketype();
            String pounds = Bmodel.getPounds();
            String name = Bmodel.getName();
            String price = Bmodel.getPricebday();
            ArrayList<String> total = Bmodel.getTotalbday();
            for (String subTotal : total) {
            totalSum += Integer.parseInt(subTotal);
        }



                String sqlCommand = "INSERT INTO BdayCake (CakeType, pounds, name, price, total) VALUES ('" + caketype + "','" + pounds + "','" + name + "','" + price + "', '"+ totalSum +"')";
                stmt.executeUpdate(sqlCommand);
          

            return true;
        } catch (Exception e) {
            System.out.println("Error message in insertBdayData: " + e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error in dao.CartDAO.insertBdayData().finally: " + e);
            }
        }
        return false;
    }
        
    public static boolean insertWeddingData(WeddingCakeModel Wmodel) {
            
            int totalSum = 0;


        Connection conn = MyConnector.dbConnect();

        try {
            Statement stmt = conn.createStatement();
            String caketype = Wmodel.getCaketype();
            String pounds = Wmodel.getPounds();
            String fname = Wmodel.getFirstName();
            String lname = Wmodel.getLastName();
            String price = Wmodel.getPricewed();
            ArrayList<String> total = Wmodel.getTotalwed();
            for (String subTotal : total) {
            totalSum += Integer.parseInt(subTotal);
        }



                String sqlCommand = "INSERT INTO WeddingCake (CakeType, Pounds, name1, name2, price, total) VALUES ('" + caketype + "','" + pounds + "','" + fname + "','" + lname + "','" + price + "', '"+ totalSum +"')";
                stmt.executeUpdate(sqlCommand);
          

            return true;
        } catch (Exception e) {
            System.out.println("Error message in insertWedData: " + e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error in dao.CartDAO.insertWedData().finally: " + e);
            }
        }
        return false;
    }
    
    
        public static boolean insertCustomData(CustomizeCakeModel Cusmodel) {
            
            int totalSum = 0;


        Connection conn = MyConnector.dbConnect();

        try {
            Statement stmt = conn.createStatement();
                    int size = Cusmodel.getSize();
                    int layers = Cusmodel.getLayers();
                    String color = Cusmodel.getColor();
                    String fill = Cusmodel.getFilling();
                    String type = Cusmodel.getType();
                    String message = Cusmodel.getMessage();
                    int price = Cusmodel.getPrice();
        


                String sqlCommand = "INSERT INTO CustomizeCake (size, layer, Cake_Type, ice_colour, Filling, Message, price) VALUES ('" + size + "','" + layers + "','" + type + "','" + color + "','" + fill + "', '"+ message +"', '"+ price +"')";
                stmt.executeUpdate(sqlCommand);
          

            return true;
        } catch (Exception e) {
            System.out.println("Error message in insertWedData: " + e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error in dao.CartDAO.insertWedData().finally: " + e);
            }
        }
        return false;
    }
    
    public static boolean updateCartData(CartModel camodel) {
        // Updates the cart table.
        // Returns true if successful, false otherwise.

        PreparedStatement preStmt;
        Connection conn = MyConnector.dbConnect();

        String sqlCommand = "UPDATE cart SET name=?, price=?, quantity=?, Total=? WHERE name=?";

        try {
            preStmt = conn.prepareStatement(sqlCommand);
            ArrayList<String> items = camodel.getItems();
            ArrayList<String> prices = camodel.getPrice();
            ArrayList<String> quantities = camodel.getQuantity();
            ArrayList<String> totals = camodel.getTotal();

            for (int i = 0; i < items.size(); i++) {
                preStmt.setString(1, items.get(i));
                preStmt.setString(2, prices.get(i));
                preStmt.setString(3, quantities.get(i));
                preStmt.setString(4, totals.get(i));
                preStmt.setString(5, items.get(i));
                preStmt.addBatch();
            }

            preStmt.executeBatch();

            return true;
        } catch (Exception e) {
            System.out.println("Error in updateCartData: " + e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error in dao.CartDAO.updateCartData().finally: " + e);
            }
        }
        return false;
    }
    
    public static boolean searchCartData(){
        /*
        * Searches for the full detail sets the value to the rmodel.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        ResultSet rs;
        Connection conn=MyConnector.dbConnect();
        

        
        String sqlCommand="SELECT name, price,quantity, total FROM cart";
        
        try{

            preStmt=conn.prepareStatement(sqlCommand);
            rs=preStmt.executeQuery();
            while (rs.next()){
                String col1 = rs.getString("name");
                String col2 = rs.getString("price");
                String col3 = rs.getString("quantity");
                String col4 = rs.getString("total");
                       
            }
//            else{
//                System.out.println("At CustomerDAO.search no username in database found");
//            }
            
          
        }
        catch(Exception e){
            System.out.println("Error in CartDAO.search: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error at CartDAO.search.try: "+e);
            }
         
        }
        return false;
    }
    
        public static boolean searchCustomizeCakeData(){
        /*
        * Searches for the full detail sets the value to the rmodel.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        ResultSet rs;
        Connection conn=MyConnector.dbConnect();
        

        
        String sqlCommand="SELECT price FROM CustomizeCake";
        
        try{

            preStmt=conn.prepareStatement(sqlCommand);
            rs=preStmt.executeQuery();
            while (rs.next()){
                String col1 = "Custom cake";
                String col2 = rs.getString("price");
                String col3 = "1";
                String col4 = rs.getString("price");
                                       
            }
//            else{
//                System.out.println("At CustomerDAO.search no username in database found");
//            }

          
        }
        catch(Exception e){
            System.out.println("Error in CartDAO.search: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error at CartDAO.search.try: "+e);
            }
         
        }
        return false;
    }
        
               public static boolean searchWeddingCakeData(){
        /*
        * Searches for the full detail sets the value to the rmodel.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        ResultSet rs;
        Connection conn=MyConnector.dbConnect();
        

        
        String sqlCommand="SELECT caketype, price, pounds, total FROM WeddingCake";
        
        try{

            preStmt=conn.prepareStatement(sqlCommand);
            rs=preStmt.executeQuery();
            while (rs.next()){
                String col1 = rs.getString("caketype");
                String col2 = rs.getString("price");
                String col3 = rs.getString("pounds");
                String col4 = rs.getString("total");
                                       
            }
//            else{
//                System.out.println("At CustomerDAO.search no username in database found");
//            }

          
        }
        catch(Exception e){
            System.out.println("Error in CartDAO.search: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error at CartDAO.search.try: "+e);
            }
         
        }
        return false;
    }
               
public static boolean searchBirthdayCakeData(){
        /*
        * Searches for the full detail sets the value to the rmodel.
        * @return true if successfull.
        * @return false if unsuccessfull with corressponding error message printed.
        */
        PreparedStatement preStmt;
        ResultSet rs;
        Connection conn=MyConnector.dbConnect();
        

        
        String sqlCommand="SELECT caketype, price, pounds, total FROM BdayCake";
        
        try{

            preStmt=conn.prepareStatement(sqlCommand);
            rs=preStmt.executeQuery();
            while (rs.next()){
                String col1 = rs.getString("caketype");
                String col2 = rs.getString("price");
                String col3 = rs.getString("pounds");
                String col4 = rs.getString("total");
                                       
            }
//            else{
//                System.out.println("At CustomerDAO.search no username in database found");
//            }

          
        }
        catch(Exception e){
            System.out.println("Error in CartDAO.search: "+e);
        }
        finally{
            try{
                conn.close();
            }
            catch(Exception e){
                System.out.println("Error at CartDAO.search.try: "+e);
            }
         
        }
        return false;
    }
    
   public static boolean deleteCartData(CartModel camodel) {
        // Deletes rows from the cart table according to the item names.
        // Returns true if successful, false otherwise.

        PreparedStatement preStmt;
        Connection conn = MyConnector.dbConnect();

        String sqlCommand = "DELETE FROM cart WHERE name=?";

        try {
            preStmt = conn.prepareStatement(sqlCommand);
            ArrayList<String> items = camodel.getItems();

            for (int i = 0; i < items.size(); i++) {
                preStmt.setString(1, items.get(i));
                preStmt.addBatch();
            }

            preStmt.executeBatch();

            return true;
        } catch (Exception e) {
            System.out.println("Error in deleteCartData: " + e);
        } finally {
            try {
                conn.close();
            } catch (Exception e) {
                System.out.println("Error in dao.CartDAO.deleteCartData().finally: " + e);
            }
        }
        return false;
   }       
   public static void main(String[] args){

   }
}