package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import view.*;
import model.*;


public class CustomizeCakeController {
	private javax.swing.JTextArea txtBillPrint;
	CustomizeCakeView cView;
	CustomizeCakeModel cModel;
    boolean[] clickedSizeLayerTypeFilling={false, false, false, false};
	
	public CustomizeCakeController(CustomizeCakeView cView){
		this.cView=cView;
        this.cModel=new CustomizeCakeModel();
		this.cView.addCustomizeCakeListener(new CustomizeCakeListener());
        
	}
	class CustomizeCakeListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent action){
			String buttonName = action.getActionCommand();
			
			if (buttonName.equals("") || buttonName.endsWith("BACK")){
				try{
				buttonName=cView.getColourButton(action);
				}catch (Exception e){
					System.err.println(e);
				}
			}
			//System.out.println("ButtonName:"+buttonName);
			switch (buttonName){
				case "6\"":
                    cModel.setSize(6);
					cView.disableAllSizeButtons();
					clickedSizeLayerTypeFilling[0]=true;
                    break;
                    
				case "8\"":
                    cModel.setSize(8);
					cView.disableAllSizeButtons();
					clickedSizeLayerTypeFilling[0]=true;
					break;
				case "10\"":
                    cModel.setSize(10);
					cView.disableAllSizeButtons();
					clickedSizeLayerTypeFilling[0]=true;
					break;
				case "12\"":
                    cModel.setSize(12);
					cView.disableAllSizeButtons();
					clickedSizeLayerTypeFilling[0]=true;
					break;
				case "1":
                    cModel.setLayers(1);
					cView.disabeleAllNumberOfLayersButtons();
                    clickedSizeLayerTypeFilling[1]=true;
					break;
				case "2":
                    cModel.setLayers(2);
					cView.disabeleAllNumberOfLayersButtons();
                    clickedSizeLayerTypeFilling[1]=true;
					break;
				case "3":
                    cModel.setLayers(3);
					cView.disabeleAllNumberOfLayersButtons();
                    clickedSizeLayerTypeFilling[1]=true;
					break;
				case "Egg Cake":
                    cModel.setType("Egg");
					cView.disableAllChooseTypeButtons();
                    clickedSizeLayerTypeFilling[2]=true;
					break;
				case "Eggless Cake":
                    cModel.setType("Eggless");
					cView.disableAllChooseTypeButtons();
                    clickedSizeLayerTypeFilling[2]=true;
					break;
                    
				case "Strawberry":
                    cModel.setFilling("Strawberry");
					cView.disableAllFillingButtons();
                    clickedSizeLayerTypeFilling[3]=true;
					break;
				case "Vanilla":
                    cModel.setFilling("Vanilla");
					cView.disableAllFillingButtons();
                    clickedSizeLayerTypeFilling[3]=true;
					break;
				case "Chocolate":
                    cModel.setFilling("Chocolate");
					cView.disableAllFillingButtons();
                    clickedSizeLayerTypeFilling[3]=true;
					break;
					
				case "redColorButton":
                    cModel.setColor("Red");
					cView.disableAllIcingColorButtons();
					break;
				case "greenColorButton":
                    cModel.setColor("Green");
					cView.disableAllIcingColorButtons();
					break;
				case "cyanColorButton":
                    cModel.setColor("Cyan");
					cView.disableAllIcingColorButtons();
					break;
				case "yellowColorButton":
                    cModel.setColor("Yellow");
					cView.disableAllIcingColorButtons();
					break;
				case "blueColorButton":
                    cModel.setColor("Blue");
					cView.disableAllIcingColorButtons();
					break;
				case "pinkColorButton":
                    cModel.setColor("Pink");
					cView.disableAllIcingColorButtons();
					break;
				case "whiteColorButton":
                    cModel.setColor("White");
					cView.disableAllIcingColorButtons();
					break;
				case "orangeColorButton":
                    cModel.setColor("Orange");
					cView.disableAllIcingColorButtons();
					break;
				case "purpleColorButton":
                    cModel.setColor("Purple");
					cView.disableAllIcingColorButtons();
					break;
					
					
				case "PRINT":
					printLayout();
					break;
				case "OK":
                    cModel.setMessage(cView.getMessageBoxText());
					cView.fillCustomizeCakeData(cModel);
					break;
                case "BACK":
                    DashboardView DaB = new DashboardView(cView.rModel);
                    DaB.setVisible(true);
                    cView.dispose();
                    break;
                
                case "PROCEED":
                    
                    CartModel cartModel = setCartListing();
//                    cView.openCart(cartModel);
                    CartView cV = new CartView(cartModel);
                   
                    cV.setVisible(true);
                    cView.dispose();
                    break;
                    
				default:
					System.err.println("Unknown Button\n"+buttonName);
					break;
			}
            checkForEnableOk();
		}
	}
	
	public void printLayout(){
		txtBillPrint = new javax.swing.JTextArea();
		String print ="********** SweetBytes **********\n\n\n"
//			+"Cashier Name : "+rModel.getFirstName()+" "+rModel.getLastName()+"\n"
//			+"Cashier Username : "+rModel.getUsername()+"\n"
			+"Size : "+cModel.getSize()+" inches\n"
			+"Layers : "+ cModel.getLayers()+"\n"
			+"Type : "+cModel.getType()+" Cake\n"
			+"Icing color : "+cModel.getColor()+"\n"
			+"Filling : "+cModel.getFilling()+"\n"
			+"Message : "+cModel.getMessage()+"\n\n\n"
			+"********** Thank you **********";
		txtBillPrint.setText(print);
		try{
			txtBillPrint.print();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
    
    public CartModel setCartListing(){
        /*
        * Creates the cart listing for CartView.
        */
        var cartModel=new CartModel();
        
        ArrayList<String> item = new ArrayList<>();
        item.add("Custom Cake");
        cartModel.setItems(item);
        
        ArrayList<String> price;
        price = new ArrayList<>();
        price.add(Integer.toString(calculatePrice()));
        cartModel.setPrice(price);
        
        ArrayList<String> quantity = new ArrayList<>();
        quantity.add("1");
        cartModel.setQuantity(quantity);
        
        cartModel.setTotal(price);
        return cartModel;
    }
	public int calculatePrice(){
        /*
        * Calculates the price of the cake.
        */
        int finalPrice=0;
        int pricePerSize=20;
        int pricePerLayers=200;
        int[] pricePerType={200, 250};
        int pricePerIcing=50;
        int[] pricePerFilling={120,110,115};
        
        finalPrice+=pricePerSize*cModel.getSize();
        finalPrice+=pricePerLayers*cModel.getLayers();
        
        if (cModel.getType().equals("Egg")){
            finalPrice+=pricePerType[0];
        }else if (cModel.getType().equals("Eggless")){
            finalPrice+=pricePerType[1];
        }
        
        switch(cModel.getFilling()){
            case "Strawberry":
                finalPrice+=pricePerFilling[0];
                break;
            case "Vanilla":
                finalPrice+=pricePerFilling[1];
                break;
            case "Chocolate":
                finalPrice+=pricePerFilling[2];
                break;
        }
        if (cModel.getColor()==null){
            System.out.println("Colour is null");
        }else{
            finalPrice+=pricePerIcing;
            
        }
        
        return finalPrice;
    }
    
    public void checkForEnableOk(){
        /*
        * Checks if the four button has been clicked.
        */
        for (int i=0; i<clickedSizeLayerTypeFilling.length; i++){
            if (!clickedSizeLayerTypeFilling[i]){
                return;
            }
        }
        cView.enableOkButton(true);
    }
	
}
