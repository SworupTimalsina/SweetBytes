


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
    
    @Test
    public void TestCroissantsAddButton(){
        // Get the initial count of corissants
        int initialCount = itemsView.countleb2;

        // Click the croissantsAddButton
        itemsView.croissantsAddButtonActionPerformed(new java.awt.event.ActionEvent(itemsView, 0, "croissantsAddButton"));

        // Get the updated count of croissants after the click
        int updatedCount = itemsView.countleb2;

        // Assert that the count has increased by 1
        assertEquals(initialCount + 1, updatedCount);
    }
    
    @Test
    public void TestBreadsAddButton(){
        // Get the initial count of Breads
        int initialCount = itemsView.countleb3;

        // Click the BreadsAddButton
        itemsView.breadAddButtonActionPerformed(new java.awt.event.ActionEvent(itemsView, 0, "BreadsAddButton"));

        // Get the updated count of Breads after the click
        int updatedCount = itemsView.countleb3;

        // Assert that the count has increased by 1
        assertEquals(initialCount + 1, updatedCount);
    }
    
    @Test
    public void TestBunsAddButton(){
        // Get the initial count of Buns
        int initialCount = itemsView.countleb4;

        // Click the BunsAddButton
        itemsView.bunsAddButtonActionPerformed(new java.awt.event.ActionEvent(itemsView, 0, "BunsAddButton"));

        // Get the updated count of Buns after the click
        int updatedCount = itemsView.countleb4;

        // Assert that the count has increased by 1
        assertEquals(initialCount + 1, updatedCount);
    }
    
    @Test
    public void TestCookiesAddButton(){
        // Get the initial count of Cookies
        int initialCount = itemsView.countleb5;

        // Click the CookiesAddButton
        itemsView.cookiesAddButtonActionPerformed(new java.awt.event.ActionEvent(itemsView, 0, "CookiesAddButton"));

        // Get the updated count of Cookies after the click
        int updatedCount = itemsView.countleb5;

        // Assert that the count has increased by 1
        assertEquals(initialCount + 1, updatedCount);
    }
    
    @Test
    public void testMacronsSubButton() {
        // Get the initial count of macrons
        int initialCount = itemsView.countleb1;

        // Click the macronsSubButton
        itemsView.macronsSubButtonActionPerformed(new java.awt.event.ActionEvent(itemsView, 0, "macronsSubButton"));

        // Get the updated count of macrons after the click
        int updatedCount = itemsView.countleb1;

        // Assert that the count has decreased by 1
        assertEquals(initialCount - 1, updatedCount);
    }
    
    @Test
    public void testCroissantsSubButton(){
        //Get the initial count of corissants
        int initialCount = itemsView.countleb2;
        
        //Click the croissantsSubButtons
        itemsView.croissantsSubButtonActionPerformed(new java.awt.event.ActionEvent(itemsView,0,"croissantsSubButton"));
        
        //Assret the update count of corissant after the click
        int updatedCount = itemsView.countleb2;
        
        //Assert that the count has decrease by 1
        assertEquals(initialCount -1, updatedCount);
    }
    
    @Test
    public void testBreadsSubButton(){
        //Get the initial count of Breads
        int initialCount = itemsView.countleb3;
        
        //Click the BreadsSubButtons
        itemsView.breadSubButtonActionPerformed(new java.awt.event.ActionEvent(itemsView,0,"BreadsSubButton"));
        
        //Assret the update count of Breads after the click
        int updatedCount = itemsView.countleb3;
        
        //Assert that the count has decrease by 1
        assertEquals(initialCount -1, updatedCount);
    }
    
     @Test
    public void testBunsSubButton(){
        //Get the initial count of Buns
        int initialCount = itemsView.countleb4;
        
        //Click the BunsSubButtons
        itemsView.bunsSubButtonActionPerformed(new java.awt.event.ActionEvent(itemsView,0,"BunsSubButton"));
        
        //Assret the update count of Buns after the click
        int updatedCount = itemsView.countleb4;
        
        //Assert that the count has decrease by 1
        assertEquals(initialCount -1, updatedCount);
    }
    
    @Test
    public void testCookiesSubButton(){
        //Get the initial count of Cookies
        int initialCount = itemsView.countleb5;
        
        //Click the CookiesSubButtons
        itemsView.cookiesSubButtonActionPerformed(new java.awt.event.ActionEvent(itemsView,0,"CookiesSubButton"));
        
        //Assret the update count of Cookies after the click
        int updatedCount = itemsView.countleb5;
        
        //Assert that the count has decrease by 1
        assertEquals(initialCount -1, updatedCount);
    }
}