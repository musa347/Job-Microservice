package com.musa.jobms.job;


import com.musa.jobms.job.dto.JobWithCompanyDto;

import java.util.List;

public interface JobService {
    List<JobWithCompanyDto> findAll();
    void createJob(Job job);
    Job getJobById(Long id);
    boolean deleteJobById(Long id);
    boolean updateJob(Long id, Job updatedJob);
}
