package com.bj58.spring.annotation.config;

import com.bj58.spring.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.bj58")
public class MyConfig {

    @Bean(name = "person2")
    public Person person() {
        return new Person("yaoxueshan", 30);
    }
}
