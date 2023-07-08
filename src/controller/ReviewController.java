/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.*;
import model.*;
/**
 *
 * @author DELL
 */
public class ReviewController {
    ReviewView view;
    ReviewModel model;
    
    public ReviewController (ReviewView view) {
        this.view=view;
    }
    
    public ReviewController(){
        
    }
    
    public void actionPerformedadd(ReviewModel model,ReviewView view) {
//        view.setMessage("Hello");
        AddReviewFrame AR=new AddReviewFrame();
        AR.show();
    }
    
    public void actionPerformedref(ReviewModel model, ReviewView view) {
        view.setMessage("Hi");
    }
    
    public void actionPerformeddel(ReviewModel model, ReviewView view) {
        view.setMessage("Hello World");
    }
}
