package com.docker.jenkins;

import com.docker.jenkins.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestController.class)
public class SpringBootHelloWorldTests {

    @Test
    public void contextLoads() {
    }

}
