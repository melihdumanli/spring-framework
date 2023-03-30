package com.dumanli.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("customName"));
        System.out.println(context.getBean("customName2"));
        System.out.println(context.getBean("customName3"));
        System.out.println(context.getBean(Address.class));
    }
}
