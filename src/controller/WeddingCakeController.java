package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.*;
import view.*;


public class WeddingCakeController {
	WeddingCakeModel wModel=new WeddingCakeModel();
	WeddingCakeView wView;
	String cakeName;
	int cakePrice;
	
	public WeddingCakeController(WeddingCakeView wView){
		this.wView=wView;
		this.wView.addWeddingCakeListener(new WeddingCakeListener());
		wView.disableProceedButton();
	}
	class WeddingCakeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				String buttonClicked = wView.getButtonName(e);// returns the name of the button clicked.
				if (buttonClicked.equals("wedProceedButton")){
					String check=checkCreds();
					if (check.equals("ok")){
						setDataToModel();
						wView.displayPlainMessage("Order listed successfully", "Thank You");
					}else{
						wView.displayErrorMessage(check);
					}
				}else{
					cakeButtonClicked(buttonClicked);
				}
				
				
				
			}
			catch (Exception exe){// when button is not found.
				System.out.println(exe);
			}
		}
	}
	
	private String checkCreds(){
		String pound=wView.getPoundsField();
		String fname=wView.getname1Field();
		String lname=wView.getname2Field();
		
		if (!(pound.isBlank())){
			try{
				if (!(Integer.parseInt(pound)>0 && Integer.parseInt(pound)<=5)){
					if (!fname.isBlank()){
						if (!lname.isBlank()){
							return "ok";
						}else{
							return "Please enter the last name";
						}
					}else{
						return "Please enter the first name";
					}
				}
				else{
					return "pound must be between 0 to 5";
				}
			}
			catch(java.lang.NumberFormatException e){
				return "Please enter a valid number";
			}
		}else{
			return "Please provide the pounds";
		}
		
	}
	
	private void setDataToModel(){
		wModel.setFirstName(wView.getname1Field());
		wModel.setLastName(wView.getname2Field());
		
		ArrayList<String> price = new ArrayList<>();
		price.add(Integer.toString(cakePrice));
		wModel.setPrice(price);
		
		ArrayList<String> pounds = new ArrayList<>();
		pounds.add(wView.getPoundsField());
		wModel.setQuantity(pounds);
		
		ArrayList<String> item = new ArrayList<>();
		item.add(cakeName);
		wModel.setItems(item);
		
		ArrayList<String> total = new ArrayList<>();
		total.add(Integer.toString(cakePrice*Integer.parseInt(wView.getPoundsField())));
		wModel.setTotal(total);
	}
	
	private void cakeButtonClicked(String button){
		wView.enableProceedButton();
		switch (button){
			case "roseThemedButton":
				wView.disableAllCakeButtons();
				cakeName="roseThemedButton";
				cakePrice=1000;
				break;
			case "classyThemedButton":
				cakeName = "classyThemedButton";
				wView.disableAllCakeButtons();
				cakePrice=1100;
				break;
			case "exoticThemedButton":
				cakeName="exoticThemedButton";
				wView.disableAllCakeButtons();
				cakePrice=1200;
				break;
		}
	}
}
