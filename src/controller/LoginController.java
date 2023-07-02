package controller;


import model.*;
import view.*;
import view.DashboardView;
import dao.CustomerDAO;

public class LoginController {
    LoginModel model;
    LoginView view;
    RegistrationModel rModel;
            
    public LoginController(LoginView view)
    {
        this.view=view;
        
        new LoginListener().actionPerformed();
        
        
    }
    class LoginListener{

        public void actionPerformed() {
            try{
                model=view.getUser();
                if(checkUser(model)){
                    view.setMessage("Login Successfully");
                    DashboardView DBV = new DashboardView(rModel);
                    DBV.show();     
                    view.dispose();
                }
                else{
                    view.setErrorMessage("Invalid username or password");
                }
            }
            catch(Exception e1){}
        }
        
        
        
        public boolean checkUser(LoginModel user) throws Exception{
            /*
            * Checks if username and password matches with database.
            * @return true if username and password matches with database.
            * @return false if it does not match.
            */
            rModel = new RegistrationModel();
            rModel.setUsername(user.getUsername());
            if (CustomerDAO.searchRegistrationData(rModel) && rModel.getPassword().equals(user.getPassword())){
                return true;
            }
            else{
                return false;
            }
        }
    }
  
    
    
}

