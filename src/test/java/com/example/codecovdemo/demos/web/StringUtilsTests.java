package com.example.codecovdemo.demos.web;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class StringUtilsTests {

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

    @Test
    void testToLowerCase() {
        // 测试空字符串
        assertEquals(null, stringUtils.toLowerCase(null));
        // 测试小写字母组成的字符串
        assertEquals("hello world", stringUtils.toLowerCase("hello world"));
        // 测试大写字母组成的字符串
        assertEquals("hello world", stringUtils.toLowerCase("HELLO WORLD"));
    }

    @Test
    void testRemoveWhitespace() {
        // 测试空字符串
        assertEquals(null, stringUtils.removeWhitespace(null));
        // 测试含有多个连续空白字符的字符串
        assertEquals("HelloWorld", stringUtils.removeWhitespace("Hello   World  "));
        // 测试仅含有空白字符的字符串
        assertEquals("", stringUtils.removeWhitespace("   "));
        // 测试不含空白字符的字符串
        assertEquals("Hello World", stringUtils.removeWhitespace("Hello World"));
    }

    // 更多测试方法...
}
