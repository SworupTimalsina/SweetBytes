
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
import model.*;
import junit.framework.Assert;
import org.junit.Test;



public class LoginTest {
    LoginView lview = new LoginView();
    CustomerDAO dao = new CustomerDAO();
    LoginModel mod = new LoginModel("admin","admin");


    
 
    public LoginTest() {   
        
    }
  

    /**
     * Test of actionPerformed method, of class LoginController.
     */
    @Test
    public void testActionPerformed(){
        System.out.println("actionPerformed");
         

        LoginController controller = new LoginController(lview);
        lview.txtusername.setText("admin");
        lview.txtpassword.setText("admin");
        lview.btnLogin.doClick();        

        Boolean expResult=true;
        
        Boolean Result= dao.checkData(mod);
        Assert.assertEquals(expResult, Result);
    }
}