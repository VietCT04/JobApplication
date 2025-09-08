package com.example.vietct.reviewms.review;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double rating;
    private Long companyId;

    public Review() {
    }

    public Review(Long id, String title, String description, Double rating, Long companyId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.companyId = companyId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setCompany(Long companyId) {
        this.companyId = companyId;
    }

    public Long getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public Double getRating(){
        return this.rating;
    }
    public Long getCompany(){
        return this.companyId;
    }
}
