package com.bj58.spring.annotation.config;

import com.bj58.spring.annotation.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean(name = "person")
    public Person person() {
        return new Person("yaoxueshan", 30);
    }
}
