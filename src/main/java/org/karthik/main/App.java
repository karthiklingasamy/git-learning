package org.karthik.main;

import com.karthik.services.ProvidingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ProvidingService service=context.getBean("service",ProvidingService.class);

        boolean status=service.invokeServices();
        if(status)
            System.out.println("Data Stored Succesfully");
        else
            System.out.println("Failed to store data");

        System.out.println("***********");

        //Exception will throws "No bean name available
        ProvidingService providingService=context.getBean("providingService",ProvidingService.class);

        boolean status2=providingService.invokeServices();
        if(status2)
            System.out.println("Data Stored Succesfully");
        else
            System.out.println("Failed to store data");


    }
}