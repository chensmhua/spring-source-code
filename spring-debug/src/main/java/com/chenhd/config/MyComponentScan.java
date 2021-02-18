package com.chenhd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.chenhd.selftag")
public class MyComponentScan {

    @ComponentScan("com.chenhd.selftag")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
