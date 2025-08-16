package com.sohel.springcore.javabasedconfig;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.sohel.springcore.*"})
public class AppConfig {
    // @Bean(name = {"employee", "employee1"})
    @Bean
    @Lazy
    @Scope(value = "prototype")
    public Employee employee(@Qualifier("dependent1") Dependent dependent) {
        return new Employee(dependent);
    }

    @Bean
    @Primary
    @Scope(value = "prototype")
    public Dependent dependent() {
        return new Dependent();
    }

    @Bean
    @Scope(value = "prototype")
    public Dependent dependent1() {
        return new Dependent();
    }

}
