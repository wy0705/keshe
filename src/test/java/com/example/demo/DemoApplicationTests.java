package com.example.demo;

import com.example.demo.entity.Clazz;
import com.example.demo.entity.User;
import com.example.demo.service.ClazzServiceImpl;
import com.example.demo.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private ClazzServiceImpl clazzService;

    @Test
    void contextLoads() {
        clazzService.insertClazz(new Clazz("三年级四班","123"));
        userService.insertUserAndJoinClazz(new User(12,"aaaa","123"),1);

    }

}
