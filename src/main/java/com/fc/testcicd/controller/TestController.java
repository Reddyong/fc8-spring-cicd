package com.fc.testcicd.controller;

import com.fc.testcicd.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;


    @GetMapping("/test")
    public String getTestString() {
        return testService.getTestString();
    }
}
