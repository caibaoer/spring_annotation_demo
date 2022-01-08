package org.com.serviceImpl;

import org.com.dao.UserDao;
import org.com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TeacherService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private StudentService studentService;


    public void test(){
        System.out.println("TeacherService test...");
        userDao.insert(new User(333,"zss",18));
    }

    //这里不会出现 Transaction rolled back because it has been marked as rollback-only 异常
    @Transactional
    public void t(){
        userDao.insert(new User(23,"sd",34));
        try{
            t1();
        }catch (Exception e){

        }


    }

    @Transactional
    public void t1(){
        userDao.insert(new User(24,"sd",34));
        throw new RuntimeException("asd");

    }

    //这里会出现 Transaction rolled back because it has been marked as rollback-only 异常
    @Transactional
    public void t2(){
        userDao.insert(new User(24,"sd",34));
        try {
            studentService.test2();
        }catch (Exception e){

        }


    }

}
