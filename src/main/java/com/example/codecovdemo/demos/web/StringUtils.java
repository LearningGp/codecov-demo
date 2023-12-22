package com.example.codecovdemo.demos.web;

public class StringUtils {

    /**
     * 判断字符串是否为空
     *
     * @param str 待检查的字符串
     * @return 如果字符串为null或者长度为0，返回true，否则返回false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }

    /**
     * 判断字符串是否不为空
     *
     * @param str 待检查的字符串
     * @return 如果字符串不为null并且长度不为0，返回true，否则返回false
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 将字符串转换为大写
     *
     * @param str 待转换的字符串
     * @return 转换后的字符串
     */
    public static String toUpperCase(String str) {
        if (str != null) {
            return str.toUpperCase();
        }
        return null;
    }

    /**
     * 将字符串转换为小写
     *
     * @param str 待转换的字符串
     * @return 转换后的字符串
     */
    public static String toLowerCase(String str) {
        if (str != null) {
            return str.toLowerCase();
        }
        return null;
    }

    /**
     * 删除字符串中的空白字符
     *
     * @param str 待处理的字符串
     * @return 处理后的字符串
     */
    public static String removeWhitespace(String str) {
        if (str != null) {
            return str.replaceAll("\\s+", "");
        }
        return null;
    }

    // 更多方法...
}

