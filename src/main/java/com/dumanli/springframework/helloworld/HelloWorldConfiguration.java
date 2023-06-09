package com.dumanli.springframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {}
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
        return new Person("Melih", 22, new Address("Baker Street", "London"));
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address customName2){
        return new Person(name, age, customName2);
    }

    @Bean
    public Person person4(String name, int age,@Qualifier("addressQualifier") Address address){
        return new Person(name, age, address);
    }

    @Bean(name = "customName")
    @Primary
    public Address address(){
        return new Address("Baker Street", "London");
    }

    @Bean(name = "customName2")
    public Address address2(){
        return new Address("Java Street", "London");
    }

    @Bean(name = "customName3")
    @Qualifier("addressQualifier")
    public Address address3(){
        return new Address("Spring Street", "London");
    }
}
