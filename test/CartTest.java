/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import view.CartView;
import view.DashboardView;
/**
 *
 * @author pemagurung
 */
public class CartTest {


/**
 *
 * @author pemagurung
 */
    
    private CartView cartView;

    @Before
    public void setUp() {
        cartView = new CartView();
    }

    @Test
    public void testJButton2ActionPerformed() {
        // Verify that initially, no DashboardView is created
        assertNull(cartView.getDashboardView());

        // Perform the action on the button
        cartView.jButton2ActionPerformed(null);

        // Verify that a DashboardView is created and is visible
        DashboardView dashboardView = cartView.getDashboardView();
        assertNotNull(dashboardView);
        assertTrue(dashboardView.isVisible());

        // Verify that the current CartView is disposed
        assertFalse(cartView.isVisible());
    }
}
