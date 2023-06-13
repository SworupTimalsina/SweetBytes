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
    private String firstName, lastName, email, dateOfBirth, username, password;
    
    public RegistrationModel(String firstName, String lastName, String email, String dateOfBirth, String username, String password){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.dateOfBirth=dateOfBirth;
        this.username=username;
        this.password=password;
    }
    public RegistrationModel(){
        this.firstName=null;
        this.lastName=null;
        this.email=null;
        this.dateOfBirth=null;
        this.username=null;
        this.password=null;
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
}
