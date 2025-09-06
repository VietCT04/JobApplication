package com.example.vietct.jobms.job;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobServicesImpl implements JobServices {
    JobRepository jobRepository;

    public JobServicesImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public void createJob(Job job) {
        try {
            System.out.println(job.getCompanyId());
            jobRepository.save(job);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void deleteJob(long id) {
        try {
            jobRepository.deleteById(id);
        } catch (Exception e){

        }
    }
    @Override
    public Optional<Job> getJobById(long id){
        return jobRepository.findById(id);
    }
}
