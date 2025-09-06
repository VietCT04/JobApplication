package com.vietct.jobApplication.job;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class JobController {
    private JobServices jobServices;
    public JobController(JobServices jobServices) {
        this.jobServices = jobServices;
    }
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){
        jobServices.createJob(job);
        return "Successfully added job";
    }

    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJob(@PathVariable long id){
        jobServices.deleteJob(id);
        return ResponseEntity.ok("Successfully deleted job");
    }

    @GetMapping("/jobs/{id}")
    public Optional<Job> getJobById(@PathVariable long id){
        return jobServices.getJobById(id);
    }

    @GetMapping("/jobs")
    public List<Job> findAll(){
        return jobServices.findAll();
    }
}
