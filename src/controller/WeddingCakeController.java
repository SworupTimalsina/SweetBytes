package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;


public class WeddingCakeController {
	WeddingCakeModel wModel;
	WeddingCakeView wView;
	
	public WeddingCakeController(WeddingCakeView wView){
		this.wView=wView;
		this.wView.addWeddingCakeListener(new WeddingCakeListener());
	}
	class WeddingCakeListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
				String buttonClicked = wView.getButtonName(e);// returns the name of the button clicked.
				
				
			}
			catch (Exception exe){// when button is not found.
				System.out.println(exe);
			}
		}
	}
	
}
