package model;

import java.util.ArrayList;


public class ItemsModel extends CartModel{
    public ItemsModel(){
        this.items=null;
        this.price=null;
        this.quantity=null;
        this.total=null;

    }
    
    public ItemsModel(ArrayList<String> items,ArrayList<String> price,ArrayList<String> quantity,ArrayList<String> total){
        this.items=items;
        this.price=price;
        this.quantity=quantity;
        this.total=total;

        
    }
	public ArrayList<Integer> getPriceAsIntegers() {
        ArrayList<Integer> priceIntegers = new ArrayList<>();
        for (String priceString : price) {
            int priceInteger = Integer.parseInt(priceString);
            priceIntegers.add(priceInteger);
        }
        return priceIntegers;
    }
    
    public ArrayList<Integer> getQuantityAsIntegers() {
        ArrayList<Integer> quantityIntegers = new ArrayList<>();
        for (String quantityString : quantity) {
            int quantityInteger = Integer.parseInt(quantityString);
            quantityIntegers.add(quantityInteger);
        }
        return quantityIntegers;
    }
    
    public ArrayList<Integer> getTotalAsIntegers() {
        ArrayList<Integer> totalIntegers = new ArrayList<>();
        for (String totalString : total) {
            int totalInteger = Integer.parseInt(totalString);
            totalIntegers.add(totalInteger);
        }
        return totalIntegers;
    }
}
