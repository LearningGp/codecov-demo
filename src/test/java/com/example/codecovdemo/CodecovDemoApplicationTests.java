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
        // 测试空字符串
        assertEquals(true, stringUtils.isEmpty(""));
        // 测试null字符串
        assertEquals(true, stringUtils.isEmpty(null));
        // 测试包含内容的字符串
        assertEquals(false, stringUtils.isEmpty("Hello World"));
        // 测试空字符串
        assertEquals(false, stringUtils.isNotEmpty(""));
        // 测试null字符串
        assertEquals(false, stringUtils.isNotEmpty(null));
        // 测试包含内容的字符串
        assertEquals(true, stringUtils.isNotEmpty("Hello World"));
    }

}
