package com.pankx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解@SpringBootApplication标注当前类为SpringBoot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //启动spring应用
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
