package com.springinaction.springidol;

import com.springinaction.springidol.Exceptions.PerformanceException;
import com.springinaction.springidol.Performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.joda.time.LocalTime;
public class Main {

    public static void main(String[] args)   {



              //  LocalTime currentTime = new LocalTime();
                System.out.println("Hello from Maven!");

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("hank");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }


    }

}