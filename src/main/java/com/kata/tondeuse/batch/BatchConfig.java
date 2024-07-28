package com.kata.tondeuse.batch;

import com.kata.tondeuse.model.Tondeuse;
import com.kata.tondeuse.processor.TondeuseItemProcessor;
import com.kata.tondeuse.reader.TondeuseItemReader;
import com.kata.tondeuse.writer.TondeuseItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;

import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableBatchProcessing
public class BatchConfig {
    @Bean
    public Job tondeuseJob(JobRepository jobRepository, PlatformTransactionManager platformTransactionManager, TondeuseItemReader reader,
                           TondeuseItemProcessor processor, TondeuseItemWriter writer){
          Step step = new StepBuilder("tondeuseStep", jobRepository)
                          .<Tondeuse,Tondeuse>chunk(1, platformTransactionManager)
                          .reader(reader)
                          .processor(processor)
                          .writer(writer)
                          .build();
          return  new JobBuilder("tondeuseJob", jobRepository)
                      .incrementer(new RunIdIncrementer())
                      .start(step)
                      .build();
    }
}
