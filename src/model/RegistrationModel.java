/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Allan
 */
public class RegistrationModel {
    private String firstName, lastName, email, dateOfBirth, username, password, confirmPassword, security, answer;
    private int id;
    
    public RegistrationModel(String firstName, String lastName, String email, String dateOfBirth, String username, String password, String confirmPassword, String security, String answer){
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
    public RegistrationModel(){
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
    
    public void setId(int id){
        this.id=id;
    }
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword=confirmPassword;
    }
    public void setSecurityQ(String security){
        this.security=security;
    }
    public void setAnswer(String answer){
        this.answer=answer;
    }
    
    
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    public String getSecurity(){
        return security;
    }
    public String getAnswer(){
        return answer;
    }
}
