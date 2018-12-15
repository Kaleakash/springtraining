package com.org;

import java.util.Date;
import java.util.List;


import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ExamResultJobListener implements JobExecutionListener{

	private Date startTime, stopTime;
	@Override
	public void afterJob(JobExecution jobExecution) {
		 startTime = new Date();
	     System.out.println("ExamResult Job starts at :"+startTime);
		
	}

	@Override
	public void beforeJob(JobExecution jobExecution) {
		
		stopTime = new Date();
        System.out.println("ExamResult Job stops at :"+stopTime);
       // System.out.println("Total time take in millis :"+getTimeInMillis(startTime , stopTime));
 
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("ExamResult job completed successfully");
            //Here you can perform some other business logic like cleanup
        }else if(jobExecution.getStatus() == BatchStatus.FAILED){
            System.out.println("ExamResult job failed with following exceptions ");
            List<Throwable> exceptionList = jobExecution.getAllFailureExceptions();
            for(Throwable th : exceptionList){
                System.err.println("exception :" +th.getLocalizedMessage());
            }
        }
	}

	/*private long getTimeInMillis(Date start, Date stop) {
		// TODO Auto-generated method stub
		 return stop.getTime() - start.getTime();
	}*/

}
