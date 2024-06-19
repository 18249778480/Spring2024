package main;


import cn.ning.Test1.serices.ConfigService;
import cn.ning.business.domain.BusinessService3;
import cn.ning.business.domain.UserService;
import cn.ning.common.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {{
        //容器初始化
        /**
         //第一种方式创建Bean xml注入
         ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");
         System.out.println(context);
         BusinessService business = (BusinessService)context.getBean("BusinessService");
         business.getUserName();

         BusinessService business2 = context.getBean(BusinessService.class);
         business.getUserName();
         **/
        /**
         //第二种方式创建Bean xml静态工厂方法
         ApplicationContext context2 = new ClassPathXmlApplicationContext("services2.xml");
         BusinessService2 business3 = context2.getBean(BusinessService2.class);
         business3.getUserName();
         **/
        /**
         //第三种方式创建Bean xml静态工厂方法
         ApplicationContext context2 = new ClassPathXmlApplicationContext("services3.xml");
         UserService user = context2.getBean(UserService.class);
            user.soutp();
         **/
        //创建注解容器
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigService c = context.getBean(ConfigService.class);
        c.getName();
    }

    }
}
