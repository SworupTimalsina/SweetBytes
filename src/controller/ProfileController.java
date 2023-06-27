package controller;

import model.*;
import view.*;


public class ProfileController {
    ProfileModel pModel;
    ProfileView pView;
    
    public ProfileController(ProfileView pView){
        this.pView=pView;
        
    }
    class ProfileListener{
        public void actionPerformed(){
            try{
                System.err.println("");
            }
            catch(Exception e){
                System.out.println("error at controller.ProfileController.ProfileListener.actionPerformed: "+e);
            }
            
        }
    }
    
    public static void main(String[] args){
        String firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer;
        
        firstName="testFname";
        lastName="testLname";
        email="test@email.com";
        dateOfBirth="2003-12-12";
        username="godf";
        password="test";
        confirmPassword="test";
        security="What is the name of the test?";
        answer="The name is test";
                
        RegistrationModel rmodel = new RegistrationModel(firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer);
        ProfileModel p1=(ProfileModel)new RegistrationModel();
        p1=(ProfileModel)rmodel;
        //System.out.println(p1.getAnswer());
    }
}
