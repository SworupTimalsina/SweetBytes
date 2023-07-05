package model;

import java.util.ArrayList;


public class WeddingCakeModel extends CartModel{
	public WeddingCakeModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
    }
    
    public WeddingCakeModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
    }
	
}
