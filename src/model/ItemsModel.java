package model;

import java.util.ArrayList;


public class ItemsModel extends CartModel{
    public ItemsModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
    }
    
    public ItemsModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
        
    }
	
}
