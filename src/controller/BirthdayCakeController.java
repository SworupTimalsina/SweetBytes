package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import view.*;
import model.*;
import dao.CartDAO;


public class BirthdayCakeController {
	BirthdayCakeModel bModel=new BirthdayCakeModel();
	BirthdayCakeView bView;
	String cakeName;
	int cakePrice;
	
	public BirthdayCakeController(BirthdayCakeView bView){
		this.bView=bView;
		this.bView.addBirthdayCakeListener(new BirthdayCakeListener());
		bView.disableProceedButton();
	}
	class BirthdayCakeListener implements ActionListener{
                       
		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				String buttonClicked = bView.getButtonName(e);// returns the name of the button clicked.
				if (buttonClicked.equals("proceedButton")){
//                                    int pr = Integer.parseInt(bView.getPoundsField());
//                                        String bdaytotal = Integer.toString(cakePrice*pr);
					String check=checkCreds();
					if (check.equals("ok")){
						setDataToModel();
						bView.displayPlainMessage("Order listed successfully", "Thank You");
						bView.dispose();
                                                
                                                    //Insert bdaycake data into database
                                                    BirthdayCakeModel BdayModel = new BirthdayCakeModel();
                                                    BdayModel.setCaketype(cakeName);
                                                    BdayModel.setPricebday(Integer.toString(cakePrice));
                                                    BdayModel.setPounds(bView.getPoundsField());
                                                    BdayModel.setName(bView.getNameField());
                                                    BdayModel.setTotalbday(bModel.getTotalbday());
                                                    CartDAO.insertBdayData(BdayModel);                                             
                                                
						var CV=new CartView(bModel);
						CV.setVisible(true);
					}else{
						bView.displayErrorMessage(check);
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
		String pound=bView.getPoundsField();
		String name=bView.getNameField();
		
		if (!(pound.isBlank())){
			try{
				if ((Integer.parseInt(pound)>0 && Integer.parseInt(pound)<=5)){
					if (!name.isBlank()){
						return "ok";
					}else{
						return "Please enter the name";
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
		bModel.setName(bView.getNameField());
		
		ArrayList<String> price = new ArrayList<>();
		price.add(Integer.toString(cakePrice));
		bModel.setPrice(price);
		
		ArrayList<String> pounds = new ArrayList<>();
		pounds.add(bView.getPoundsField());
		bModel.setQuantity(pounds);
		
		ArrayList<String> item = new ArrayList<>();
		switch (cakeName){
			case "simpleCakeButton":
				item.add("Simple Cake");
                                cakeName="Simple Cake";
				break;
			case "fancyCakeButton":
				item.add("Fancy Cake");
                                cakeName="Fancy Cake";
				break;
			case "classicCakeButton":
				item.add("Classic Cake");
                                cakeName="Classic Cake";
				break;
			default:
				item.add(cakeName);
				break;
		}
                		
		bModel.setItems(item);
                		
		ArrayList<String> total = new ArrayList<>();
		total.add(Integer.toString(cakePrice*Integer.parseInt(bView.getPoundsField())));
		bModel.setTotal(total);
                bModel.setTotalbday(total);
                


               

	}
	
	private void cakeButtonClicked(String button){
		bView.enableProceedButton();
		switch (button){
			case "fancyCakeButton":
				bView.disableAllCakeButtons();
				cakeName="fancyCakeButton";
				cakePrice=800;
				break;
			case "simpleCakeButton":
				cakeName = "simpleCakeButton";
				bView.disableAllCakeButtons();
				cakePrice=600;
				break;
			case "classicCakeButton":
				cakeName="classicCakeButton";
				bView.disableAllCakeButtons();
				cakePrice=700;
				break;
		}
	}
}
