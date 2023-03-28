package com.dumanli.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age) {}
record Address (String fistLine, String city) {}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Melih";
    }

    @Bean
    public int age(){
        return 22;
    }

    @Bean
    public Person person(){
        return new Person("Melih", 22);
    }

    @Bean
    public Address address(){
        return new Address("Baker Street", "London");
    }
}
