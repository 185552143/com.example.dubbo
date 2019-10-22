package com.example.dubbo.run;

import com.example.dubbo.service.SomeService;
import org.apache.dubbo.container.Main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerZKRun {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("META-INF/spring/spring-consumer.xml");
        SomeService someService = (SomeService) ac.getBean("someService");
        String result = someService.hello("dubbo");
        System.out.println(result);
    }
}
