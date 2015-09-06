package com.red.utilsbox;

import java.text.DateFormat;
import java.text.ParseException;
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

    /**
     * 获取当前时间戳
     * @return long型时间戳
     */
    public static long getUnixTime() {
        long unixtime = System.currentTimeMillis() / 1000;
        return unixtime;
    }

    /**
     * 将时间戳转换为指定格式的日期字符串
     * @param unixtime 10位时间戳<code> eg:1441165597</code>
     * @param pattern 日期格式参数
     * @return 格式化后的日期字符串
     */
    public static String getDateFromUnixtime(long unixtime, String pattern) {
        Date date = new Date(unixtime * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    /**
     * 时长转换
     * @param second 秒<code>.eg:125635</code>
     * @return 包含时分秒的字符串<code>.eg:34小时53分钟55秒</code>
     */
    public static String changeSecond(int second) {
        StringBuffer sb = new StringBuffer();
        if (second > 3600) {
            sb.append(second / 3600 + "小时");
        }
        second = second % 3600;
        sb.append(second / 60 + "分钟" + second % 60 + "秒");
        return sb.toString();
    }
    
    /**
     * 获取两日期之间的天数
     * @param startdate yyyyMMdd
     * @param enddate yyyyMMdd
     * @return
     */
    public static int getBetweenDates(String begindate,String enddate){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date bDate = null;
        Date eDate = null;
        int day = 0;
        try {
            bDate = sdf.parse(begindate);
            eDate = sdf.parse(enddate);
            long result = eDate.getTime() - bDate.getTime();
            day = (int) (result / 86400000L);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return day + 1;
    }

    public static void main(String[] args) {
        System.out.println(getUnixTime());
        System.out.println(changeSecond(125635));
        System.out.println(getDateFromUnixtime(1441165017, "yyyy.MM.dd HH:mm:ss"));
    }
}
