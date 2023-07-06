package model;

import java.util.ArrayList;


public class WeddingCakeModel extends CartModel{
	
	String firstName, lastName;
	
	public WeddingCakeModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
	this.firstName=null;
	this.lastName=null;
    }
    
    public WeddingCakeModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary, String firstName, String lastName){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
	this.firstName=firstName;
	this.lastName=lastName;
    }
    
    public void setFirstName(String firstName){
	    this.firstName=firstName;
    }
    public void setLastName(String lastName){
	    this.lastName=lastName;
    }
    
    public String getFirstName(){
	    return firstName;
    }
    public String getLastName(){
	    return lastName;
    }
	
}
