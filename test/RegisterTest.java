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

public class RegisterTest {
    RegistrationView rview = new RegistrationView();
    CustomerDAO dao = new CustomerDAO();
    RegistrationModel mod=new RegistrationModel();
    
    public RegisterTest() {
    }
 
    @Test
    public void testActionPerformed() {
         RegistrationController controller = new RegistrationController(rview);
//         rview.NameText.setText("test");
//         rview.ContactText.setText("777");
//         rview.PasswordText.setText("wda");
//         rview.ConfirmpassText.setText(" adawd");
//         rview.emailText4.setText("AWDAWD");
//         rview.RegisterBtn.doClick();

         

        Boolean expResult=true;
        
//        Boolean Result=dao.RegisterData(mod);
//        assertEquals(expResult, Result);
      
    
}
}
