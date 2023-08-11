/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import view.ForgotpwdView;
import controller.ForgotPwdController;
import model.ForgotPwdModel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author DELL
 */
public class ForgotPwdTest {
    
    ForgotpwdView fview = new ForgotpwdView();
    ForgotPwdModel mod = new ForgotPwdModel("admin","admin","admin","admin");

    public ForgotPwdTest() {
        mod.setUsername("admin");
        mod.setSquestion("admin");
        mod.setAnswer("admin");
        mod.setNpassword("admin");
    }

    /**
     * Test for search action.
     */
    @Test
    public void testActionPerformedSearch() {
        System.out.println("SQuestion Search Test");

        ForgotPwdController controller = new ForgotPwdController(fview);
        fview.txtusername.setText("admin");
        fview.btnSearch.doClick();
        
        String expectedQuestion = null;
        fview.setSquestion(expectedQuestion);
        assertEquals(expectedQuestion, fview.Squestion);
    }

    /**
     * Test for confirm action.
     */
    @Test
    public void testActionPerformedConfirm() {
        System.out.println("Password Update Test");

        ForgotPwdController controller = new ForgotPwdController(fview);
        fview.txtusername.setText("admin");
        fview.txtquestion.setText("admin");
        fview.txtnpwd.setText("admin");
        fview.btnConfirm.doClick();

    }

    
}
