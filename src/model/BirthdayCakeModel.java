package model;

import java.util.ArrayList;


public class BirthdayCakeModel extends CartModel{
	String name;
	
	public BirthdayCakeModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
	this.name=null;
    }
    
    public BirthdayCakeModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary, String name){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
	this.name=name;
    }
    
    public void setName(String name){
	    this.name=name;
    }
    
    public String getName(){
	    return name;
    }
}
