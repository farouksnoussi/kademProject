package tn.agena3000.cloud.kademproject.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LoggingAspects {
    @After("execution(* tn.agena3000.cloud.kademproject.services.*.*(..))")
    public void afterMethode(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("Out of Method "+name);
    }
    @Before("execution(* tn.agena3000.cloud.kademproject.services.*.*(..))")
    public void beforeMethode(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        log.info("In Method " + name);
    }
    @Around("execution(* tn.agena3000.cloud.kademproject.services.DepartementService.ajouterDepartement(..))")
    public Object exec(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String name = proceedingJoinPoint.getSignature().getName();
        log.info("Around IN " + name);
        Object object = proceedingJoinPoint.proceed();
        return object;
    }
}

