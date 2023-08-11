/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */



import view.*;
import javax.swing.table.DefaultTableModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import view.ReviewView;

/**
 *
 * @Purnima
 */
public class ReviewwTest {
    
    private ReviewView view;
    
    public ReviewwTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        view = new ReviewView();
    }
    
    @After
    public void tearDown() {
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
