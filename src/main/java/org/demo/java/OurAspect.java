package org.demo.java;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OurAspect {

    @Pointcut("execution(* org.demo.java.aop.*.*(..))")
    public void doPointCut()
    {

    }
    @Before("doPointCut()")
    public void logSomethingBefore(){
        System.out.println("Method Execution starting");
    }

    @After("doPointCut()")
    public void logSomethingAfter(){
        System.out.println("After method Execution completed");
    }

    @Around("doPointCut()")
    public String logSomethingAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Reached to the join point");
        String s = (String) proceedingJoinPoint.proceed();
        s = "What a powerful tool is aop";
        return s;
    }
}
