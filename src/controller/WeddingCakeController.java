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
			
		}
		
	}
}
