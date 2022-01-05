package org.com;

import org.com.pojo.User;
import org.com.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppMain
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=
                new AnnotationConfigApplicationContext(APPConfig.class);

        UserService userService=(UserService)annotationConfigApplicationContext.getBean("userServiceImpl");

        User user=new User(1,"zs",15);

        userService.insert(user);
    }
}
