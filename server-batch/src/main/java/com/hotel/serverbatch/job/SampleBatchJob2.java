package com.hotel.serverbatch.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@Slf4j
public class SampleBatchJob2 {

    @Bean
    public Job testSimpleJob2(JobRepository jobRepository, Step testStep2){

        return new JobBuilder("testSimpleJob2", jobRepository)
                .start(testStep2)
                .incrementer(new RunIdIncrementer())
                .build();

    }

    @Bean
    public Step testStep2(JobRepository jobRepository, Tasklet testTasklet2, Tasklet testTasklet22, PlatformTransactionManager platformTransactionManager){
        return new StepBuilder("testStep2", jobRepository)
                .tasklet(testTasklet2, platformTransactionManager)
                .tasklet(testTasklet22, platformTransactionManager)
                .tasklet((StepContribution contribution, ChunkContext chunkContext) -> {
                    log.debug("### SampoleBatchJob2-inner tasklet ###");
                    return RepeatStatus.FINISHED;
                }, platformTransactionManager)
                .build();
    }

    @Bean
    public Tasklet testTasklet2(){
        log.debug("### SampoleBatchJob2-testTasklet2 ###");
            return ((contribution, chunkContext) -> {
            System.out.println("테스트2");

            return RepeatStatus.FINISHED;
        });
    }

    @Bean
    public Tasklet testTasklet22(){
        log.debug("### SampoleBatchJob2-testTasklet22 ###");
        return ((contribution, chunkContext) -> {
            System.out.println("테스트22");

            return RepeatStatus.FINISHED;
        });
    }
}
