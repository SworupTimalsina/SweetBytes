package controller;



import view.*;
import model.*;


public class CustomizeCakeController {
	private javax.swing.JTextArea txtBillPrint;
	CustomizeCakeView cView;
	CustomizeCakeModel cModel;
	
	public CustomizeCakeController(CustomizeCakeView cView, CustomizeCakeModel cModel, boolean print){
		this.cView=cView;
		this.cModel=cModel;
		if (!print){
			new CustomizeCakeListener().actionPerformed();
		}
		else{
			printLayout();
		}
	}
	class CustomizeCakeListener{
		public void actionPerformed(){
			cView.fillCustomizeCakeData(cModel);
		}
	}
	
	public void printLayout(){
		txtBillPrint = new javax.swing.JTextArea();
		String print ="********** SweetBytes **********\n\n\n"+
			"Size : "+cModel.getSize()+" inches\n"
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
