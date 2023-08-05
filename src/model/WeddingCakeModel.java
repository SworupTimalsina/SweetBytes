package model;

import java.util.ArrayList;


public class WeddingCakeModel extends CartModel{
	
	String firstName, lastName;
        String Caketype;
        String pounds;
        String pricewed;
        ArrayList<String> totalwed;
	
	public WeddingCakeModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
	this.firstName=null;
	this.lastName=null;
        this.Caketype=null;
        this.pounds=null;
        this.pricewed=null;
        this.totalwed = null;
    }
    
    public WeddingCakeModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary, String firstName, String lastName, String Caketype, String pounds, String pricewed, ArrayList<String> totalwed){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
	this.firstName=firstName;
	this.lastName=lastName;
        this.Caketype=Caketype;
        this.pounds=pounds;
        this.pricewed = pricewed;
        this.totalwed = totalwed;
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
    
    public String getCaketype() {
        return Caketype;
    }

    public void setCaketype(String Caketype) {
        this.Caketype = Caketype;
    }

    public String getPounds() {
        return pounds;
    }

    public void setPounds(String pounds) {
        this.pounds = pounds;
    }

    public String getPricewed() {
        return pricewed;
    }

    public void setPricewed(String pricewed) {
        this.pricewed = pricewed;
    }

    public ArrayList<String> getTotalwed() {
        return totalwed;
    }

    public void setTotalwed(ArrayList<String> totalwed) {
        this.totalwed = totalwed;
    }
	
}
