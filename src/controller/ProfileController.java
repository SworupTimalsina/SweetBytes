package controller;

import dao.CustomerDAO;
import javax.swing.JOptionPane;
import model.*;
import view.*;
import Regulations.*;


public class ProfileController {
    ProfileModel pModel, updateProfModel;
    ProfileView pView;
   
    
    public ProfileController(ProfileView pView, boolean update){
        this.pView=pView;
        pModel=pView.setNewProfile();
        updateProfModel=pView.setUpdateProfile();
        
        try{// sets the e_id
            updateProfModel.setId(CustomerDAO.find_e_id(updateProfModel));
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        if (update){
            new ProfileListener().updateActionPerformed();
        }
        else{
            new ProfileListener().deleteActionPerformed();
        }
    }
    
    class ProfileListener{
        public void updateActionPerformed(){
            var checkCreds=new ProfilePageRegulation(updateProfModel);// creates a new instance of regulations
            String checkCredsResult=checkCreds.CheckRegistrationPageRegulation();// checks validity of all the information provided in registration page.
            if(checkCredsResult.equals("ok")){// if every information provided is valid.
                if (CustomerDAO.updateRegistrationData(updateProfModel)){
                    pView.displayPlainMessage("Successfully updated","Success");
                }else{
                    pView.displayErrorMessage("Failed to Update Information");
                }
            }else{
                pView.displayErrorMessage(checkCredsResult);
            }
        }
        
        public void deleteActionPerformed(){
            if (CustomerDAO.deleteRegistrationData(pModel)){
                pView.displayPlainMessage("Successfully deleted account","Success");
            }else{
                pView.displayErrorMessage("Failed to delete account");
            }
        }
    }
    
    public static void main(String[] args){}
}
