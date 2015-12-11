package com.springinaction.springidol;

import com.springinaction.springidol.exceptions.PerformanceException;
import com.springinaction.springidol.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.joda.time.LocalTime;
public class Main {

    public static void main(String[] args) {


        //  LocalTime currentTime = new LocalTime();
        System.out.println("Hello from Maven!");
        try {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-idol.xml");


        Performer performer = (Performer) ctx.getBean("kenny");

            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
/*
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.register(SpringIdolConfig.class);
        ctx.refresh();
        Performer performer = (Performer) ctx.getBean("kenny");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            e.printStackTrace();
        }*/

        //  City city=(City)ctx.getBean("city");
        //  System.out.println(city.toString());


    }

}