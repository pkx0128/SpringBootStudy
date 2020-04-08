package com.pankx;

import com.pankx.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class TestApplicationTests {

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
