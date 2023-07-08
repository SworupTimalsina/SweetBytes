/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AduMan
 */

import dao.*;
import view.*;
import controller.*;
import junit.framework.Assert;
import model.*;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import static view.RegistrationView.convertDateToNum;


public class WrongDetailsLogin {
    LoginView lview = new LoginView();
    CustomerDAO dao = new CustomerDAO();
    LoginModel mod = new LoginModel("admin","notadmin");


    
 
    public WrongDetailsLogin() {   
        
    }
  

    /**
     * Test of actionPerformed method, of class LoginController.
     */
    @Test
    public void testActionPerformed(){
        System.out.println("actionPerformed");
         

        LoginController controller = new LoginController(lview);
        lview.txtusername.setText("admin");
        lview.txtpassword.setText("notadmin");
        lview.btnLogin.doClick();        

        Boolean expResult=false;
        
        Boolean Result= dao.checkData(mod);
        Assert.assertEquals(expResult, Result);
    }
}
    

