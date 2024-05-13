package com.fc.testcicd.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
@ActiveProfiles("dev")
public class TestServiceImplTest {
    @Autowired
    private TestServiceImpl testService;

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @Test
    void checkPortSuccess(){
        assertEquals("3444", port);
    }

    @Test
    void checkPortFail(){
        assertNotEquals("8080", port);
    }

    @Test
    void getTestStringSuccess() {
        assertEquals("okay " + applicationName + " " + port, testService.getTestString());
    }

    @Test
    void getTestStringFail() {
        assertNotEquals("okay Test FAIL", testService.getTestString());
    }
}
