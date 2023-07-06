/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class ReviewModel {
    String review,revnum;
    
    public ReviewModel (String review, String revnum) {
        this.review=review;
        this.revnum=revnum;
        
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getRevnum() {
        return revnum;
    }

    public void setRevnum(String revnum) {
        this.revnum = revnum;
    }

}
