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
    int review_no;
    String review;
    
    public ReviewModel (int review_no, String review) {
        this.review_no=review_no;
        this.review=review;
        
    }

    public int getReview_no() {
        return review_no;
    }

    public void setReview_no(int review_no) {
        this.review_no = review_no;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    
}
