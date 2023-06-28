package controller;

import view.*;
import model.*;
import Regulations.RegistrationPageRegulation;
import dao.CustomerDAO;


public class RegistrationController {
    RegistrationModel rModel;
    RegistrationView rView;
    RegistrationPageRegulation checkCreds;
    
    public RegistrationController(RegistrationView view){
        this.rView=view;
        new RegistrationListener().actionPerformed();
    }
    class RegistrationListener {
        public void actionPerformed() {
            try{
                rModel=rView.setNewUser();// sets all the new given value from registration page to the rModel
                checkCreds=new RegistrationPageRegulation(rModel);// creates a new instance of regulations
                String checkCredsResult=checkCreds.CheckRegistrationPageRegulation();// checks validity of all the information provided in registration page.
                if(checkCredsResult.equals("ok")){// if every information provided is valid.
                    rView.displayPlainMessage("User Registered", "Success");
                    CustomerDAO.InsertRegistrationData(rModel);
                }
                else{// displays a suitable error message pop up.
                    rView.displayErrorMessage(checkCredsResult);
                }
            }
            catch(Exception e1){
                System.out.println("Exception message of RegistrationListener"+e1);
            }
        }
        
        
    }
}

