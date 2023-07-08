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
import junit.framework.Assert.*;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import static view.RegistrationView.convertDateToNum;

public class RegisterTest {
    RegistrationView rview = new RegistrationView();
    CustomerDAO dao = new CustomerDAO();
    RegistrationModel mod=new RegistrationModel();
    
    public RegisterTest() {
    }
 
    @Test
    public void testActionPerformed() {
         RegistrationController controller = new RegistrationController(rview);
         rview.fnameField.setText("test");
         rview.lnameField.setText("testlname");
         rview.emailField.setText("test@gmail.com");
         rview.dayField.setSelectedItem("01");
         rview.monthField.setSelectedItem("Feb");
         rview.yearField.setSelectedItem("2001");
         rview.unameField1.setText("tester");
         rview.passwordField.setText("test@gmail.com");
         rview.repeatPasswordField.setText("test@gmail.com");
         rview.sec.setText("test@gmail.com");
         rview.aans.setText("test@gmail.com");
         String DOB=rview.yearField.getSelectedItem().toString()+"-"+convertDateToNum(rview.monthField.getSelectedItem().toString())+"-"+rview.dayField.getSelectedItem().toString();
         
         
         


         

        Boolean expResult=true;
        
        Boolean Result=dao.InsertRegistrationData(mod);
        assertEquals(expResult, Result);
      
    
}
}
