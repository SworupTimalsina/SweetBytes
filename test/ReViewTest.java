/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.ReView;

/**
 *
 * @author DELL
 */
public class ReViewTest {

    private ReView view;
    
    public ReViewTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        view = new ReView();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateDB method, of class ReView.
     */
//    @Test
//    public void testUpdateDB() {
//        System.out.println("updateDB");
//        ReView instance = new ReView();
//        instance.updateDB();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of main method, of class ReView.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        ReView.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    
    @Test
    public void testAddReviewButton() {
        DefaultTableModel tableModel = (DefaultTableModel) view.jTable1.getModel();
        int initialRowCount = tableModel.getRowCount();

        view.txtreview.setText("New review");
        view.btnadd.doClick();
        view.updateDB();

        int updatedRowCount = tableModel.getRowCount();
        assertEquals(initialRowCount + 1, updatedRowCount);
    }
 

    @Test
    public void testClearButton() {
        view.txtreview.setText("Some review text");
        view.btnclear.doClick();

      
        assertEquals("", view.txtreview.getText());
    }

    
    @Test
    public void testDeleteReviewButton() {
        DefaultTableModel tableModel = (DefaultTableModel) view.jTable1.getModel();
        int initialRowCount = tableModel.getRowCount();
        view.jTable1.setRowSelectionInterval(0, 0);
        view.btndelete.doClick();
        view.updateDB();

        int updatedRowCount = tableModel.getRowCount();
        assertEquals(initialRowCount - 1, updatedRowCount);
    }
    
    
    @Test
    public void testUpdateReviewButton() {
        DefaultTableModel tableModel = (DefaultTableModel) view.jTable1.getModel();

        view.jTable1.setRowSelectionInterval(0, 0);
        view.txtreview.setText("Updated review");
        view.btnupdate.doClick();
        view.updateDB();

        String updatedReview = tableModel.getValueAt(0, 1).toString();
        assertEquals("Updated review", updatedReview);
    }

}
    

