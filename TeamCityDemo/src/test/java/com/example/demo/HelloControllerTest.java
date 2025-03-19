package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloControllerTest {

    @Test
    void testHelloEndpoint() {
        HelloController controller = new HelloController();
        assertThat(controller.sayHello()).isEqualTo("Hello from TeamCity CI/CD Pipeline!");
    }
}
