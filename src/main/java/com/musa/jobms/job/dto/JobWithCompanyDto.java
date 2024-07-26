package com.musa.jobms.job.dto;

import com.musa.jobms.job.Job;
import com.musa.jobms.job.external.Company;
import lombok.Data;

@Data
public class JobWithCompanyDto {
    private Job job;
   private Company company;
}
