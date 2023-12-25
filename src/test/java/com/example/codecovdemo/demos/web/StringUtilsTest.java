package com.example.codecovdemo.demos.web;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testIsEmpty() {
        // 测试空字符串
        assertEquals(true, stringUtils.isEmpty(""));
        // 测试null字符串
        assertEquals(true, stringUtils.isEmpty(null));
        // 测试包含内容的字符串
        assertEquals(false, stringUtils.isEmpty("Hello World"));
    }

    @Test
    void testIsNotEmpty() {
        // 测试空字符串
        assertEquals(false, stringUtils.isNotEmpty(""));
        // 测试null字符串
        assertEquals(false, stringUtils.isNotEmpty(null));
        // 测试包含内容的字符串
        assertEquals(true, stringUtils.isNotEmpty("Hello World"));
    }

    @Test
    void testToUpperCase() {
        // 测试空字符串
        assertEquals(null, stringUtils.toUpperCase(null));
        // 测试小写字母组成的字符串
        assertEquals("HELLO WORLD", stringUtils.toUpperCase("hello world"));
        // 测试大写字母组成的字符串
        assertEquals("HELLO WORLD", stringUtils.toUpperCase("HELLO WORLD"));
    }
}