package model;

import java.util.ArrayList;


public class BirthdayCakeModel extends CartModel{
    
    String name;
    String Caketype;
    String pounds;
    String pricebday;
    ArrayList<String> totalbday;
                
	public BirthdayCakeModel(){
        
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;
        this.promoCode=null;
        this.cartSummary=null;
	this.name=null;
        this.Caketype=null;
        this.pounds=null;
        this.pricebday=null;
        this.totalbday = null;
    }
    
    public BirthdayCakeModel(ArrayList<String> items, ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total,String promoCode,String cartSummary, String name, String Caketype, String pounds, String pricebday, ArrayList<String> totalbday){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;
        this.promoCode=promoCode;
        this.cartSummary=cartSummary;
	this.name=name;
        this.Caketype=Caketype;
        this.pounds=pounds;
        this.pricebday = pricebday;
        this.totalbday = totalbday;
    }
    
    public void setName(String name){
	    this.name=name;
    }
    
    public String getName(){
	    return name;
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

    public String getPricebday() {
        return pricebday;
    }

    public void setPricebday(String pricebday) {
        this.pricebday = pricebday;
    }

    public ArrayList<String> getTotalbday() {
        return totalbday;
    }

    public void setTotalbday(ArrayList<String> totalbday) {
        this.totalbday = totalbday;

    }
    

}


