/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Allan
 */
public class MyConnector {
    public static Connection dbConnect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //driver name for mysql connector for java//to load the jar file into form
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/SweetBytes","root","root@2003");

            System.out.println("Connected!");
            return conn;
        }
        catch(Exception e){
            System.out.println("e.getMessage()");
        }
        return null;
    }
}
