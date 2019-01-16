package di.demo;

import di.logic.Logging;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPdemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
        Logging lg = (Logging) context.getBean("myBusinessClass");
        lg.doSomething();
    }
}
