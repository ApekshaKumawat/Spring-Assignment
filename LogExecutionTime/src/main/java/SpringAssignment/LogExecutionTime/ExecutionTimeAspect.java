package SpringAssignment.LogExecutionTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ExecutionTimeAspect {
	
	@Around("execution(* SpringAssignment.Triangle.perimeter())")
	  public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

			long startTime=System.currentTimeMillis();
			Object proceed=joinPoint.proceed();
		
			long executionTime=System.currentTimeMillis() - startTime;
			
			System.out.println(joinPoint.getSignature()+ " executed in "+executionTime+" ms");
			return proceed;
		
	     
	}
	
}
