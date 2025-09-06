package com.example.vietct.jobms.job;

import jakarta.persistence.*;

@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String jobName;
    private long salary;

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private Long companyId;

    public void setId(long id) {
        this.id = id;
    }

    public Job() {

    }

    public Job(long id, String jobName, long salary, long companyId) {
        this.id = id;
        this.jobName = jobName;
        this.salary = salary;
        this.companyId = companyId;
    }
    public Long getCompanyId(){
        return this.companyId;
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
