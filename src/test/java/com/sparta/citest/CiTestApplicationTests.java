package com.sparta.citest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiTestApplicationTests {

    @Autowired
    CiTestService service;

    @Test
    void serviceHelloTest() {
        assertEquals("hello ci", service.hello());
    }

    @Test
    void sumTest() {
        assertEquals(5, service.sum(2, 3));
    }
}