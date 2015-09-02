package com.red.utilsbox;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Date日期工具类
 * @author Red
 *@author it_red@sina.com
 *@version 1.0
 */
public class DateUtil {

    /**
     * 将当前日期按指定格式输出
     * @param pattern 格式：yyyy-MM-dd HH:mm:ss(可以使用任意符号隔开，HH:24小时;hh:12小时)
     * @return 格式化后的字符串
     * @author Red
     * @throws exceptions No exception thrown
     * @output 规定格式化后的当前日期
     */
    public static String getFormateDate(String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        // DateFormat sd=DateFormat.getDateInstance(DateFormat.FULL,
        // Locale.getDefault());按照本地系统模式输出
        // return sd.format(new Date());
        return sdf.format(new Date());
    }

    /**
     * 将指定日期按照指定格式输出
     * @param date 任意日期
     * @param pattern 格式：yyyy-MM-dd HH:mm:ss(可以使用任意符号隔开，HH:24小时;hh:12小时)
     * @return 格式化后的字符串
     * @throws exceptions No exception thrown
     * @output 规定格式化后的当前日期
     */
    public static String getFormateDate(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    // public static String

    public static void main(String[] args) {
        System.out.println(getFormateDate(new Date(), "yyyy.MM.dd HH:mm:ss"));
    }
}
