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
         rview.passwordField.setText("testpass");
         rview.repeatPasswordField.setText("testpass");
         rview.sec.setText("test?");
         rview.aans.setText("test");
//         String DOB=rview.yearField.getSelectedItem().toString()+"-"+convertDateToNum(rview.monthField.getSelectedItem().toString())+"-"+rview.dayField.getSelectedItem().toString();
         
        RegistrationModel modell = new RegistrationModel();
        mod.setFirstName(rview.fnameField.getText());
        mod.setLastName(rview.lnameField.getText());
        mod.setEmail(rview.emailField.getText());
        String day = rview.dayField.getSelectedItem().toString();
        String month = convertDateToNum(rview.monthField.getSelectedItem().toString());
        String year = rview.yearField.getSelectedItem().toString();
        String dob = year + "-" + month + "-" + day;
        mod.setDateOfBirth(dob);
        mod.setUsername(rview.unameField1.getText());
        mod.setPassword(rview.passwordField.getText());
        mod.setSecurityQ(rview.sec.getText());
        mod.setAnswer(rview.aans.getText());
         


         

        Boolean expResult=true;
        
        Boolean Result=dao.InsertRegistrationData(mod);
        assertEquals(expResult, Result);
      
    
}
}
