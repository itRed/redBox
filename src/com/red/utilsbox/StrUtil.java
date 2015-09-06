package com.red.utilsbox;

import java.util.Arrays;

/**
 * 字符串处理工具类
 * @author Red
 */
public class StrUtil {

    /**
     * 去掉字符串中重复的字符
     * @param str
     * @return
     */
    public static String delRepeat(String str) {
        StringBuffer sb = new StringBuffer();
        char s;
        for (int i = 0; i < str.length(); i++) {
            s = str.charAt(i);
            if (sb.indexOf(String.valueOf(s)) == -1) {
                sb.append(s);
            }
        }
        return sb.toString();
    }

    /**
     * 压缩连续出现的字符串
     * @param str
     * @return
     */
    public static String compressStr(String str) {
        StringBuffer result = new StringBuffer();
        final int count = str.length();
        char c1 = str.charAt(0);
        int sum = 1; // 最大字符串数
        for (int i = 1; i < count; i++) {
            char c2 = str.charAt(i);
            if (c1 == c2) {
                sum++;
                continue;
            }
            result.append(sum).append(c1);
            c1 = c2;// 赋值
            sum = 1;
        }
        result.append(sum).append(c1);
        return result.toString();
    }

    public static String deCompressStr(String str) {
        StringBuffer result = new StringBuffer();
        char c1 = str.charAt(0);
        if (isNumeric(c1)) {
            int n = Integer.parseInt(String.valueOf(c1));
            for (int i = 0; i < n; i++) {
                if (isNumeric(str.charAt(i + 1))) {
                    continue;
                } else {
                    c1 = str.charAt(i + 1);
                    result.append(str.charAt(i + 1));
                }
            }
        }
        return result.toString();
    }

    /**
     * 判断字符串是否为数字
     * @param str
     * @return
     */
    public static boolean isNumeric(Object str) {
        String s = String.valueOf(str);
        for (int i = s.length(); --i >= 0;) {
            if (!Character.isDigit(s.charAt(i))) { return false; }
        }
        return true;
    }

    public static void main(String[] args) {
        // System.out.println(compressStr("xxxyyyyyyzz"));
        System.out.println(deCompressStr("3x6y2z"));
    }
}
