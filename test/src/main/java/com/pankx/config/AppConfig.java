package com.pankx.config;

import com.pankx.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @Configuration指明当前类为配置类用于替代之前的配置文件
 */
@Configuration
public class AppConfig {
    /**
     *
     * @return
     */
    @Bean
    public Cat cat(){
        System.out.println("AppConfig配置类的cat方法执行。。。。");
        return new Cat();
    }
}
