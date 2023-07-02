package com.hotel.serverbatch.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.support.JdbcTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@Slf4j
public class SampleBatchJob {


    @Bean
    public Job job(JobRepository jobRepository, JdbcTransactionManager transactionManager) {
        log.debug("### SampoleBatchJob-job ###");

        return new JobBuilder("testSimpleJob", jobRepository)
                .start(testStep1(jobRepository, transactionManager))
                .build();
    }

    @Bean
    public Step testStep1(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        log.debug("### SampoleBatchJob-testStep1 ###");

        return new StepBuilder("testStep1", jobRepository)
                .tasklet((StepContribution contribution, ChunkContext chunkContext) -> {
                    System.out.println("Hello, world!");
                    return RepeatStatus.FINISHED;
                }, transactionManager)
                .build();
    }


}
