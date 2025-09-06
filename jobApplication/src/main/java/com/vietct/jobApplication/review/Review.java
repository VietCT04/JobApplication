package com.vietct.jobApplication.review;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vietct.jobApplication.company.Company;
import jakarta.persistence.*;

@Entity
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Double rating;

    @JsonIgnore
    @ManyToOne
    private Company company;

    public Review() {
    }

    public Review(Long id, String title, String description, Double rating, Company companyId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.company = companyId;
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

    public void setCompany(Company company) {
        this.company = company;
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
    public Company getCompany(){
        return this.company;
    }
}
