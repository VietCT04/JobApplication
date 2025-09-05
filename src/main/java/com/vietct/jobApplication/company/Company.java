package com.vietct.jobApplication.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.vietct.jobApplication.job.Job;
import com.vietct.jobApplication.review.Review;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobList;

    @OneToMany(mappedBy = "company")
    private List<Review> reviewList;

    public Company() {
    }

    public Company(Long id, String name, String description, List<Job> jobList, List<Review> reviewList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.jobList = jobList;
        this.reviewList = reviewList;
    }

    public Long getId(){
        return this.id;
    }

    public List<Job> getJobList(){
        return this.jobList;
    }

    public List<Review> getReviewList(){
        return this.reviewList;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }
}
