package com.embarkx.jobms.job.dto;

import com.embarkx.jobms.job.Job;
import com.embarkx.jobms.job.external.Company;

public class JobWithCompanyDTO {
    private Job job;
    private Company company;

    public Job getJob() {
        return job;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
