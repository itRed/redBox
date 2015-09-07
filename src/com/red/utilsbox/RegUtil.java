package com.red.utilsbox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式匹配验证工具类
 * @author Red
 * @version 1.0
 */
public class RegUtil {

    /**
     * 判断输入的电话号码是否正确
     * @param phoneNumber 纯数字电话号
     * @return true/false
     */
    public static boolean isPhoneNum(String phoneNumber) {
        Pattern p = Pattern.compile("^[1]([3][0-9]{1}|59|58|88|89)[0-9]{8}$");
        Matcher m = p.matcher(phoneNumber);
        return m.matches();
    }

    /**
     * 验证邮箱格式是否正确
     * @param email 待验证的邮箱地址
     * @return true/false
     */
    public static boolean isEmail(String email) {
        Pattern p = Pattern.compile("^([a-zA-Z0-9_\\.\\-])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$");
        Matcher m = p.matcher(email);
        return m.matches();
    }

    /**
     * 验证该Ip地址是否合法
     * @param ipaddr 待验证的IP
     * @return true/false
     */
    public static boolean isIPAddress(String ipaddr) {
        Pattern pattern = Pattern
            .compile("\\b((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\.((?!\\d\\d\\d)\\d+|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
        Matcher m = pattern.matcher(ipaddr);
        return m.matches();
    }

    /**
     * 验证邮政编码
     * @param postnumber 待验证邮编
     * @return true/false
     */
    public static boolean isPostNumber(String postnumber) {
        Pattern pattern = Pattern.compile("^[0-9]\\d{5}(?!\\d)$");
        Matcher m = pattern.matcher(postnumber);
        return m.matches();
    }

    public static void main(String[] args) {
        // System.out.println(isPhoneNum("13540457528"));
        System.out.println(isPostNumber("610502"));
    }

}
