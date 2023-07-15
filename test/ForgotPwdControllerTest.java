/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.ForgotpwdTest to edit this template
 */


/**
 *
 * @author pemagurung
 */
import org.junit.*;
import static org.junit.Assert.*;
import java.sql.*;

public class ForgotPwdControllerTest {

    private Connection connection;

    @Before
    public void setUp() throws Exception {
        String url = "jdbc:mysql://localhost:3306/SweetBytes";
        String username = "root";
        String password = "Asdf1234@";
        connection = DriverManager.getConnection(url, username, password);
    }

    @After
    public void tearDown() throws Exception {
        if (connection != null) {
            connection.close();
        }
    }

    @Test
    public void testCheckQuestion_WithCorrectUsername() throws Exception {
        // Arrange
        String username = "testUser";
        String expectedQuestion = "Question";

        // Act
        String actualQuestion = checkQuestion(username);

        // Assert
        assertEquals(expectedQuestion, actualQuestion);
    }

    @Test
    public void testCheckQuestion_WithIncorrectUsername() throws Exception {
        // Arrange
        String username = "nonExistentUser";

        // Act
        String question = checkQuestion(username);

        // Assert
        assertNull(question);
    }

    @Test
    public void testCheckPass_WithCorrectAnswer() throws Exception {
        // Arrange
        String username = "testUser";
        String answer = "Answer";
        String newPassword = "NewPassword";
        boolean expected = true;

        // Act
        boolean actual = checkPass(username, answer, newPassword);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckPass_WithIncorrectAnswer() throws Exception {
        // Arrange
        String username = "testUser";
        String answer = "wrongAnswer";
        String newPassword = "NewPassword";
        boolean expected = true;

        // Act
        boolean actual = checkPass(username, answer, newPassword);

        // Assert
        assertEquals(expected, actual);
    }

    private String checkQuestion(String username) throws Exception {
        String question = null;
        String sql = "SELECT securityQ FROM creds WHERE u_name = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, username);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    question = resultSet.getString("securityQ");
                }
            }
        }
        return question;
    }

    private boolean checkPass(String username, String answer, String newPassword) throws Exception {
        String sql = "SELECT * FROM creds WHERE u_name = ? AND answer = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        statement.setString(2, answer);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            sql = "UPDATE creds SET pass = ? WHERE u_name = ?";
            statement = connection.prepareStatement(sql);
            statement.setString(1, newPassword);
            statement.setString(2, username);
            statement.executeUpdate();
            return false;
        }
        resultSet.close();
        statement.close();
        return true;
    }
}
