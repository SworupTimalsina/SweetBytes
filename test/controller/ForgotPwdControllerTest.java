/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

import model.ForgotPwdModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.ForgotpwdView;

/**
 *
 * @author pemagurung
 */
public class ForgotPwdControllerTest {
    
    public ForgotPwdControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of actionPerformedsearch method, of class ForgotPwdController.
     */
    @Test
    public void testActionPerformedsearch() {
        System.out.println("actionPerformedsearch");
        ForgotPwdModel model = null;
        ForgotpwdView view = null;
        ForgotPwdController instance = new ForgotPwdController();
        instance.actionPerformedsearch(model, view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkQuestion method, of class ForgotPwdController.
     */
    @Test
    public void testCheckQuestion() throws Exception {
        System.out.println("checkQuestion");
        ForgotPwdModel user = null;
        ForgotPwdController instance = new ForgotPwdController();
        boolean expResult = false;
        boolean result = instance.checkQuestion(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actionPerformedconfirm method, of class ForgotPwdController.
     */
    @Test
    public void testActionPerformedconfirm() {
        System.out.println("actionPerformedconfirm");
        ForgotPwdModel model = null;
        ForgotpwdView view = null;
        ForgotPwdController instance = new ForgotPwdController();
        instance.actionPerformedconfirm(model, view);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPass method, of class ForgotPwdController.
     */
    @Test
    public void testCheckPass() throws Exception {
        System.out.println("checkPass");
        ForgotPwdModel user = null;
        ForgotPwdController instance = new ForgotPwdController();
        boolean expResult = false;
        boolean result = instance.checkPass(user);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
