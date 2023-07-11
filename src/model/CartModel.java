package model;

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
    
}