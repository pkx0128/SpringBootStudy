package com.pankx;

import com.pankx.bean.Cat;
import com.pankx.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TestApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    public void testcat(){
        //判断ioc容器是否存在名字为cat的bean
        System.out.println(ioc.containsBean("cat"));
    }


    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
