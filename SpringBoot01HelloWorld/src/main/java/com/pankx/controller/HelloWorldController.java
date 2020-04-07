package com.pankx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController注解相当于@Controller与@ResponseBody注解
 */
//@Controller
@RestController
public class HelloWorldController {
    @RequestMapping("/hello")

    public String sayHi(){
        return "Hello world";
    }
}
