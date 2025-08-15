package com.sohel.springcore.javabasedconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    // @Bean(name = {"employee", "employee1"})
    @Bean
    public Employee employee() {
        return new Employee();
    }
}
