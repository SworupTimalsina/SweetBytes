


import javax.security.auth.callback.Callback;
import org.junit.Before;
import org.junit.Test;
import view.ItemsView;
import static org.junit.Assert.assertEquals;

public class ItemsViewTest {
    private ItemsView itemsView;

    @Before
    public void setUp() {
        itemsView = new ItemsView("DashboardView");
        itemsView.setVisible(true);
    }

    @Test
    public void testMacronsAddButton() {
        // Get the initial count of macrons
        int initialCount = itemsView.countleb1;

        // Click the macronsAddButton
        itemsView.macronsAddButtonActionPerformed(new java.awt.event.ActionEvent(itemsView, 0, "macronsAddButton"));

        // Get the updated count of macrons after the click
        int updatedCount = itemsView.countleb1;

        // Assert that the count has increased by 1
        assertEquals(initialCount + 1, updatedCount);
    }
    
    
    
    
//    
//    
//    
//    
//    
    
    
    
    
    
}
