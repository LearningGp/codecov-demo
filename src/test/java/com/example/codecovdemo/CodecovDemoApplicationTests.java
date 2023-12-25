package com.example.codecovdemo;

import com.example.codecovdemo.demos.web.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CodecovDemoApplicationTests {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void contextLoads() {
    }

}
