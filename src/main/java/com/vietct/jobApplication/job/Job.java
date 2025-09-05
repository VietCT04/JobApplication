package com.vietct.jobApplication.job;

import com.vietct.jobApplication.company.Company;
import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String jobName;
    private long salary;

    @ManyToOne
    private Company company;

    public Job() {

    }

    public Job(long id, String jobName, long salary) {
        this.id = id;
        this.jobName = jobName;
        this.salary = salary;
    }
    public Company getCompany(){
        return this.company;
    }
    public Long getId(){
        return this.id;
    }
    public String getJobName(){
        return this.jobName;
    }
    public long getSalary(){
        return this.salary;
    }
}
