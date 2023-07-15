/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pemagurung
 */
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import view.ContactUs;




public class ContactUsTest {

    private ContactUs contactUs;

    @Before
    public void setUp() {
        contactUs = new ContactUs();
    }

    @Test
    public void testContactUsTitle() {
        String expectedTitle = "ContatUs page";
        String actualTitle = contactUs.getTitle();
        assertThat(actualTitle, is(equalTo(expectedTitle)));
    }

}