package org.com;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class HPAspect {
    @Before("execution(public void org.com.serviceImpl.TeacherService.test())")
    public void  hpBefore(){
        System.out.println("aspect before...");
    }


}
