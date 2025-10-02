package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass  // aspect
{
	final static private Logger logg= LoggerFactory.getLogger(AspectClass.class);

//	@Pointcut("execution(public * com.example.service.BusinessClass.bookTicket())") // pointcut
//	public void p1() {}
	
	@Pointcut("@annotation(com.example.annos.MyAnnotation)")
	public void p1() {}

	
//    @Before("p1()") // join point
//	public void beginTx()// advice
//	{
//     System.out.println("Transactions started");
//	}
//    
//    @After("p1()") // join point
//   	public void emailReport()// advice
//   	{
//        System.out.println("email report sent");
//   	}
//    
//    @AfterReturning("p1()") // join point
//   	public void commitTxn()// advice
//   	{
//        System.out.println("transaction commited");
//        
//   	}
//    
//    @AfterThrowing("p1()") // join point
//   	public void rollBackTxn()// advice
//   	{
//        System.out.println("transaction rolledBack");       
//   	}
//    
    @Around("p1()")// joinpoint
	public void aroundAdviceTx(ProceedingJoinPoint jp)
	{
		logg.info("transaction started");  // Before
		try {
		Object obj=	jp.proceed();//calling business method
		System.out.println(obj);  // after return
		logg.info("transaction committed");
		} catch (Throwable e) {			
			System.out.println(e.getMessage());
			logg.error("an unwanted exception arrised ticket was not booked"); // after throwing
			logg.info("transaction rollback");
		}
		logg.info("email report sent"); // after
	}




}
