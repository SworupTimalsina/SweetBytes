package controller;

import view.*;
import model.*;
import Regulations.RegistrationPageRegulation;
import dao.CustomerDAO;


public class RegistrationController {
    RegistrationModel rModel;
    RegistrationView view;
    RegistrationPageRegulation checkCreds;
    
    public RegistrationController(RegistrationView view){
        this.view=view;
        new RegistrationListener().actionPerformed();
    }
    class RegistrationListener {
        public void actionPerformed() {
            try{
                rModel=view.setNewUser();// sets all the new given value from registration page to the rModel
                checkCreds=new RegistrationPageRegulation(rModel);// creates a new instance of regulations
                String checkCredsResult=checkCreds.CheckRegistrationPageRegulation();// checks validity of all the information provided in registration page.
                if(checkCredsResult.equals("ok")){// if every information provided is valid.
                    view.displayPlainMessage("User Registered", "Success");
                    CustomerDAO.InsertRegistrationData(rModel);
                }
                else{// displays a suitable error message pop up.
                    view.displayErrorMessage(checkCredsResult);
                }
            }
            catch(Exception e1){
                System.out.println("Exception message of RegistrationListener"+e1);
            }
        }
        
        
    }
}

