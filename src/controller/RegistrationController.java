package controller;

import view.*;
import model.*;
import Regulations.RegistrationPageRegulation;
import dao.CustomerDAO;


public class RegistrationController {
    RegistrationModel model;
    RegistrationView view;
    RegistrationPageRegulation checkCreds;
    
    public RegistrationController(RegistrationView view){
        this.view=view;
        new RegistrationListener().actionPerformed();
    }
    class RegistrationListener {
        public void actionPerformed() {
            try{
                model=view.setNewUser();// sets all the new given value from registration page to the model
                checkCreds=new RegistrationPageRegulation(model);// creates a new instance of regulations
                String checkCredsResult=checkCreds.CheckRegistrationPageRegulation();// checks validity of all the information provided in registration page.
                if(checkCredsResult.equals("ok")){// if every information provided is valid.
                    view.displayMessage("User Registered");
                    CustomerDAO.InsertRegistrationData(model);
                }
                else{// displays a suitable error message pop up.
                    view.displayMessage(checkCredsResult);
                }
            }
            catch(Exception e1){
                System.out.println("Exception message of RegistrationListener"+e1);
            }
        }
        
        
    }
}

