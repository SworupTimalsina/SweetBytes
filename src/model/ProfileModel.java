package model;

/**
 *
 * @author AduMan
 */
public class ProfileModel extends RegistrationModel{
//    private String firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer;
//    private int id;
    
    
        public ProfileModel(String firstName, String lastName, String email, String dateOfBirth, String username, String password, String confirmPassword, String security, String answer){
            this.firstName=firstName;
            this.lastName=lastName;
            this.email=email;
            this.dateOfBirth=dateOfBirth;
            this.username=username;
            this.password=password;
            this.confirmPassword=confirmPassword;
            this.security=security;
            this.answer=answer;
            this.id=0;
        }
        
    public ProfileModel(){
        this.firstName=null;
        this.lastName=null;
        this.email=null;
        this.dateOfBirth=null;
        this.username=null;
        this.password=null;
        this.confirmPassword=null;
        this.security=null;
        this.answer=null;
        this.id=0;
    }
    
    public static void main(String[] args){
        
        String firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer;
        
        firstName="testFname";
        lastName="testLname";
        email="test@email.com";
        dateOfBirth="2003-12-12";
        username="godf";
        password="test";
        confirmPassword="test";
        security="What is the name of the test?";
        answer="The name is test";
                
        RegistrationModel m1 = new ProfileModel(firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer);
        
        System.out.println(m1.getSecurity());
        
    }
}

