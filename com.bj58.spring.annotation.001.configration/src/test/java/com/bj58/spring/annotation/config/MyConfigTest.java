package com.bj58.spring.annotation.config;

import com.bj58.spring.annotation.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyConfigTest {

    @Test
    public void person() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }
}