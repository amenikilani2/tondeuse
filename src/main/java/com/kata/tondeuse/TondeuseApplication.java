package com.kata.tondeuse;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TondeuseApplication implements CommandLineRunner {

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    public static void main(String[] args) {
        SpringApplication.run(TondeuseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        JobExecution execution = jobLauncher.run(job, new JobParametersBuilder().toJobParameters());
        System.out.println("Job Status : " + execution.getStatus());
    }
}
