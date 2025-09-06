package com.vietct.jobApplication.job;

import java.util.List;
import java.util.Optional;

public interface JobServices {
    void createJob(Job job);
    List<Job> findAll();
    void deleteJob(long id);
    Optional<Job> getJobById(long id);
}
