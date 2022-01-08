package org.com.serviceImpl;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoService  {

    private UserServiceImpl userServiceImpl;


    private String name;

    public DemoService( @Value("iron Fruit") String name) {
        this.name = name;
        System.out.println("DemoService construct string ..."+name);
    }

   /* public DemoService(StudentService studentService) {
        System.out.println("DemoService construct studentService ...");
    }*/

    /*
    构造函数使用下面就报错 No qualifying bean of type 'java.lang.String' available
    原因解析：构造函数的参数，spring 会根据类型或者名字去单例池中查找，没有的话，就创建。
    如果使用string等类型的，可以使用@Value赋值
    private String name;

    public DemoService(String name) {
        this.name = name;
    }
    */
    /*public DemoService() {
        System.out.println("DemoService construct");
    }*/

   /* public DemoService(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
        System.out.println("DemoService construct userServiceImpl");
    }*/

    /*public DemoService(StudentService studentService) {
        System.out.println("DemoService construct StudentService");
    }*/
}
