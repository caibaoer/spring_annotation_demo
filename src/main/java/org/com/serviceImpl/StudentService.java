package org.com.serviceImpl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class StudentService {
    public StudentService(DemoService demoService) {
        System.out.println("StudentService construct demoService...");
    }

    @Transactional
    public void test(){
        System.out.println("StudentService test...");
    }

    @Transactional
    public void test2(){
        System.out.println("StudentService test...");
        throw  new RuntimeException("...");
    }


    public void test3(){
        System.out.println("StudentService test...");
        throw  new RuntimeException("...");
    }
}
