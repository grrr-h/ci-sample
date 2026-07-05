package com.sparta.citest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CiTestController {
    @GetMapping("/")
    public String home() {
        return "hello";
    }

    @GetMapping("/num")
    public List<String> items() {
        return List.of("num1", "num2");
    }
}
