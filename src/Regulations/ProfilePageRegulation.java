package Regulations;

import model.RegistrationModel;

public class ProfilePageRegulation extends RegistrationPageRegulation{
    /*
    * A class that validates the user given information.
    */
    
    public ProfilePageRegulation(){}
    public ProfilePageRegulation(RegistrationModel model){
        this.model=model;
        System.out.println(model.getFirstName());
    }
    @Override
    public String CheckRegistrationPageRegulation(RegistrationModel model){
        /*
        * main function that checks every regulation.
        * @return "ok" if everything is valid.
        * @return corresponding error message.
        */
        String firstCheck=FieldEmptyCheck(model);
        if (firstCheck.equals("ok")){// Checks if any fields are left empty.
            if (!BothPasswordsMatch(model.getPassword(), model.getConfirmPassword())){// Checks if both passwords match
                return "Passwords does not match";
            }
            else{
                if (isValidEmail(model.getEmail())){
			return "ok";
		}
		else{
			return "Enter a valid email";
		}
            }
        }else{
            return firstCheck;
        }
    }
    @Override
    public String CheckRegistrationPageRegulation(){
        /*
        * main function that checks every regulation.
        * @return "ok" if everything is valid.
        * @return corresponding error message.
        */
        String firstCheck=FieldEmptyCheck();
        if (firstCheck.equals("ok")){
            
        
            if (!BothPasswordsMatch()){
                return "Passwords does not match";
                }

            else{
                if (isValidEmail()){
			return "ok";
		}
		else{
			return "Enter a valid email";
		}
            }
        }
        else{
            return firstCheck;
        }
    }
}
