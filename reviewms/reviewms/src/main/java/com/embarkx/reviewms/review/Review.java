package com.embarkx.reviewms.review;



import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Title;
    private String description;
    private double rating;
    private Long companyId;


    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }


    public Review() {
    }
//    public Review(Long id, String title, String description, double rating) {
//        this.id = id;
//        this.Title = title;
//        this.description = description;
//        this.rating = rating;
//    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return Title;
    }
    public void setTitle(String title) {
        Title = title;

    }
    public String getDescription() {
        return description;

    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;

    }




}
