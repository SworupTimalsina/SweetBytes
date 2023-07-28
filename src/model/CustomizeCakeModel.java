package model;


public class CustomizeCakeModel {
    /*
    * model for Customize cake.
    */
    int size, layers, price;



    public void setPrice(int price) {
        this.price = price;
    }
    String type, color, filling, message;
    
    public void setSize(int size){
        this.size=size;
    }
    public void setLayers(int layers){
        this.layers=layers;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilling(String filling){
        this.filling=filling;
    }
    public void setMessage(String message){
        this.message=message;
    }
    
    public int getSize(){
        return size;
    }
    public int getLayers(){
        return layers;
    }
    public String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }
    public String getFilling(){
        return filling;
    }
    public String getMessage(){
        return message;
    }
    public int getPrice() {
        return price;
    }
}
