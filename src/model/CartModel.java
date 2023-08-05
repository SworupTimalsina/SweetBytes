package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import Database.MyConnector;

import java.util.ArrayList;
import java.util.HashMap;

public class CartModel {
    ArrayList<String> items, price,quantity,total;
    HashMap<String,Integer> itemsMap;


    String promoCode,cartSummary;
    
    public CartModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
    }
    
    public CartModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
              
    }
    public HashMap<String, Integer> getItemsMap() {
        return itemsMap;
    }

    public void setItemsMap(HashMap<String, Integer> itemsMap) {
        this.itemsMap = itemsMap;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public void setCartSummaray(String cartSummary) {
        this.cartSummary = cartSummary;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public String getCartSummary() {
        return cartSummary;
    }

    public void setQuantity(ArrayList<String> quantity) {
        this.quantity = quantity;
    }

    public void setTotal(ArrayList<String> total) {
        this.total = total;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }
    
    public ArrayList<String> getPrice() {
        return price;
    }
    
    public void setPrice(ArrayList<String> price) {
        this.price = price;
    }

    public ArrayList<String> getQuantity() {
        return quantity;
    }

    public ArrayList<String> getTotal() {
        return total;
    }
    
    public void fetchCartDataFromDB() {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> price = new ArrayList<>();
        ArrayList<String> quantity = new ArrayList<>();
        ArrayList<String> total = new ArrayList<>();

        try {            
            
            Connection conn = MyConnector.dbConnect();
            Statement stmt = conn.createStatement();
            String sqlQuery = "SELECT name, price, quantity, total FROM cart";
            ResultSet rs = stmt.executeQuery(sqlQuery);

            while (rs.next()) {
                items.add(rs.getString("name"));
                price.add(rs.getString("price"));
                quantity.add(rs.getString("quantity"));
                total.add(rs.getString("total"));
            }

            rs.close();
            stmt.close();
            conn.close();

            this.items = items;
            this.price = price;
            this.quantity = quantity;
            this.total = total;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}