package controller;

import view.ItemsView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import dao.*;
import model.*;
import view.*;


public class ItemsController {
	ArrayList<String> items, price,quantity,total;
	ItemsModel iModel;
	ItemsView iView;
	
	public ItemsController(ItemsView iView){
		this.iView=iView;
		
		this.iView.addItemsListener(new ItemsListener());
		
	}
	
	class ItemsListener implements ActionListener{
		public void actionPerformed(ActionEvent action){
			try{
				String buttonClicked=iView.findButtonName(action);
				if (buttonClicked.equals("addToCartButton")){
					addToCartProcess();
					addToModel();
					iView.setVisible(false);
                                        iModel.setItemsMap(iView.itemsMap);
                                        //Insert item data into database
                                        CartModel cartModel = new CartModel();
                                        cartModel.setItems(items);
                                        cartModel.setPrice(price);
                                        cartModel.setQuantity(quantity);
                                        cartModel.setTotal(total);
                                        CartDAO.insertCartData(cartModel);
                                    
					CartView CV = new CartView(iModel);
					CV.setVisible(true);
				}
			}
			catch (Exception e){ 
				System.out.println(e);
			}
			
			
		}
	}
	public void addToModel(){
		iModel=new ItemsModel();
		iModel.setItems(items);
		iModel.setPrice(price);
		iModel.setQuantity(quantity);
		iModel.setTotal(total);
	}
	public void addToCartProcess(){
		items=new ArrayList<>();
		price=new ArrayList<>();
		quantity=new ArrayList<>();
		total =new ArrayList<>();
		
		if (iView.countleb1>0){
			items.add("Macarons");
			price.add("80");
			quantity.add(Integer.toString(iView.countleb1));
			total.add(Integer.toString(iView.countleb1*80));
		}
		if (iView.countleb2>0){
			items.add("Croissants");
			price.add("70");
			quantity.add(Integer.toString(iView.countleb2));
			total.add(Integer.toString(iView.countleb2*70));
		}
		if (iView.countleb3>0){
			items.add("Breads");
			price.add("60");
			quantity.add(Integer.toString(iView.countleb3));
			total.add(Integer.toString(iView.countleb3*60));
		}
		if (iView.countleb4>0){
			items.add("Buns");
			price.add("50");
			quantity.add(Integer.toString(iView.countleb4));
			total.add(Integer.toString(iView.countleb4*50));
		}
		if (iView.countleb5>0){
			items.add("Cookies");
			price.add("90");
			quantity.add(Integer.toString(iView.countleb5));
			total.add(Integer.toString(iView.countleb5*90));
		}
		if (iView.countleb6>0){
			items.add("Cupcakes");
			price.add("100");
			quantity.add(Integer.toString(iView.countleb6));
			total.add(Integer.toString(iView.countleb6*100));
		}
                
                ItemsModel itemsModel = new ItemsModel(items, price, quantity, total);

                // Call the conversion methods to get the integer values
                ArrayList<Integer> priceIntegers = itemsModel.getPriceAsIntegers();
                ArrayList<Integer> quantityIntegers = itemsModel.getQuantityAsIntegers();
                ArrayList<Integer> totalIntegers = itemsModel.getTotalAsIntegers();
                
                // Assign the converted integer values back to the price, quantity, and total ArrayLists
                price = new ArrayList<>(priceIntegers.size());
                quantity = new ArrayList<>(quantityIntegers.size());
                total = new ArrayList<>(totalIntegers.size());

                for (Integer priceInteger : priceIntegers) {
                    price.add(priceInteger.toString());
                }

                for (Integer quantityInteger : quantityIntegers) {
                    quantity.add(quantityInteger.toString());
                }

                for (Integer totalInteger : totalIntegers) {
                    total.add(totalInteger.toString());
                }

		
	}
}
