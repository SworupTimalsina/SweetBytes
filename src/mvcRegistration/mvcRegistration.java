/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcRegistration;
import controller.*;
import view.*;
import model.*;

/**
 *
 * @author Allan
 */
public class mvcRegistration {
    public static void main(String[] args){
        RegistrationView theView = new RegistrationView();
        RegistrationModel themodel = new RegistrationModel();
        RegistrationController theController = new RegistrationController(theView);
        
    }
}
