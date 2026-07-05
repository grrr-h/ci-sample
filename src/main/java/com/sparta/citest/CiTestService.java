package com.sparta.citest;

import org.springframework.stereotype.Service;

@Service
public class CiTestService {
    public String hello() {
        return "hello ci";
    }

    public int sum(int a, int b) {
        return a / b;
    }
}
