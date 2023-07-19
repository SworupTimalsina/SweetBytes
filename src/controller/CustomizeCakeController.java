package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import view.*;
import model.*;


public class CustomizeCakeController {
	private javax.swing.JTextArea txtBillPrint;
	CustomizeCakeView cView;
	CustomizeCakeModel cModel;
	RegistrationModel rModel;
	
	public CustomizeCakeController(CustomizeCakeView cView, CustomizeCakeModel cModel, RegistrationModel rModel, boolean print){
		this.cView=cView;
		this.cModel=cModel;
		this.rModel=rModel;
		
		if (!print){
			//new CustomizeCakeListener().actionPerformed();
			
		}
		else{
			printLayout();
		}
	}
	public CustomizeCakeController(CustomizeCakeView cView){
		this.cView=cView;
        this.cModel=new CustomizeCakeModel();
		this.cView.addCustomizeCakeListener(new CustomizeCakeListener());
        this.rModel=cView.rModel;
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
			System.out.println("ButtonName:"+buttonName);
			switch (buttonName){
				case "6\"":
                    cModel.setSize(6);
					cView.disableAllSizeButtons();
					break;
				case "8\"":
                    cModel.setSize(8);
					cView.disableAllSizeButtons();
					break;
				case "10\"":
                    cModel.setSize(10);
					cView.disableAllSizeButtons();
					break;
				case "12\"":
                    cModel.setSize(12);
					cView.disableAllSizeButtons();
					break;
				case "1":
                    cModel.setLayers(1);
					cView.disabeleAllNumberOfLayersButtons();
					break;
				case "2":
                    cModel.setLayers(2);
					cView.disabeleAllNumberOfLayersButtons();
					break;
				case "3":
                    cModel.setLayers(3);
					cView.disabeleAllNumberOfLayersButtons();
					break;
				case "Egg Cake":
                    cModel.setType("Egg");
					cView.disableAllChooseTypeButtons();
					break;
				case "Eggless Cake":
                    cModel.setType("Eggless");
					cView.disableAllChooseTypeButtons();
					break;
                    
				case "Strawberry":
                    cModel.setFilling("Strawberry");
					cView.disableAllFillingButtons();
					break;
				case "Vanilla":
                    cModel.setFilling("Vanilla");
					cView.disableAllFillingButtons();
					break;
				case "Chocolate":
                    cModel.setFilling("Chocolate");
					cView.disableAllFillingButtons();
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
//                    DashboardView DaB = new DashboardView(rModel);
//                    DaB.show();
//                    cView.dispose();
                    cView.openDashboard();
                    break;
                    
				default:
					System.err.println("Unknown Button\n"+buttonName);
					break;
			}
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
	
	
}
