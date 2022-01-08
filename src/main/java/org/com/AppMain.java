package org.com;

import org.com.pojo.User;
import org.com.service.UserService;
import org.com.serviceImpl.StudentService;
import org.com.serviceImpl.TeacherService;
import org.com.serviceImpl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Field;


public class AppMain
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=
                new AnnotationConfigApplicationContext(APPConfig.class);
        TeacherService teacherService=(TeacherService)annotationConfigApplicationContext.getBean("teacherService");
       // teacherService.test();


           // teacherService.t();
        teacherService.t2();


        System.out.println(teacherService);
        /*StudentService studentService=(StudentService)annotationConfigApplicationContext.getBean("studentService");
        System.out.println(studentService);*/

       /* UserService userService=(UserService)annotationConfigApplicationContext.getBean("userServiceImpl");

        User user=new User(1,"zs",15);

        userService.insert(user);*/

        /*UserServiceImpl userServiceImpl=new UserServiceImpl();
        Field[] fileds=userServiceImpl.getClass().getDeclaredFields();
        for(Field field:fileds){
            try {
                String name=field.getName();
                if(name.equals("name")){
                    field.set(userServiceImpl,(Object)"huangpan");
                }

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        System.out.println("test over");*/
    }
}
