package com.example.viet.companyms.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    private List<Long> jobList;

    private List<Long> reviewList;

    public Company() {
    }

    public Company(Long id, String name, String description, List<Long> jobList, List<Long> reviewList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.jobList = jobList;
        this.reviewList = reviewList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setJobList(List<Long> jobList) {
        this.jobList = jobList;
    }

    public void setReviewList(List<Long> reviewList) {
        this.reviewList = reviewList;
    }

    public Long getId(){
        return this.id;
    }

    public List<Long> getJobList(){
        return this.jobList;
    }

    public List<Long> getReviewList(){
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
