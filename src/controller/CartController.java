package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;


public class CartController {
    CartModel cModel;
    CartView cView;
    public CartController(CartView cView){
	    this.cView=cView;
	    this.cView.addCartViewListener(new CartControllerListener());
	    
    }
    class CartControllerListener implements ActionListener{
	    @Override
	    public void actionPerformed(ActionEvent e){
		    String buttonClicked = e.getActionCommand();
		    switch (buttonClicked){
				case "OK":
					cView.calculateDiscount();
					break;
				case "CHECKOUT":
                                        cView.checkoutdisplay();
					
					break;
				default :
					System.err.println("Button not found in Cart");
					break;
		    }
	    }
    }
    
    
}
