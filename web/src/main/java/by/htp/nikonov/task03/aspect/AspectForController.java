package by.htp.nikonov.task03.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectForController {
	
	
	@Pointcut("execution(* by.htp.nikonov.task03.controller.*.*(..))")
	public void controllerMethod() {}
	
	
	
	@Before("controllerMethod()")
	public void logginBeforeControllerMethod(JoinPoint point) {			
		Logger logger= Logger.getLogger(point.getSignature().getDeclaringType());	
		logger.info(point.getSignature().getName()+": started");				
	}
	
	
	@AfterReturning("controllerMethod()")
	public void logginAfterReturningControllerMethod(JoinPoint point) {			
		Logger logger= Logger.getLogger(point.getSignature().getDeclaringType());	
		logger.info(point.getSignature().getName()+": finished");				
	}
	
	@AfterThrowing(pointcut="controllerMethod()", throwing="exception", argNames="exception")
	public void logginAfterThrowingControllerMethod(JoinPoint point, Exception exception) {			
		Logger logger= Logger.getLogger(point.getSignature().getDeclaringType());	
		logger.error(point.getSignature().getName()+": stopped with exception", exception);				
	}
	

}
