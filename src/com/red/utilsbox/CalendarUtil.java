package com.red.utilsbox;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar日期工具类
 * @author Red
 */
public class CalendarUtil {

    /**
     * 获取当前月的最后一天的日期
     * @return 本月最后一天的日期
     * @output Sat Aug 01 11:05:11 GMT+08:00 2015 
     * <p>需要根据实际情况转换</p>
     */
    public static Date getFirstDayOfMonth() {
        Calendar calendar = Calendar.getInstance();// 获取当前日期
        calendar.add(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    /**
     * 获取上个月的第一天
     * @return 上月第一天的日期
     * @output Sat Aug 01 11:05:11 GMT+08:00 2015 
     * <p>需要根据实际情况转换</p>
     */
    public static Date getFirstDayOfLastMonth() {
        Calendar calendar = Calendar.getInstance();// 获取当前日期
        calendar.add(Calendar.MONTH, -1);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return calendar.getTime();
    }

    /**
     * 获取当前月份的最后一天的日期
     * @return 当前月份最后一天的日期
     * @output Sat Aug 01 11:05:11 GMT+08:00 2015 
     * <p>需要根据实际情况转换</p>
     */
    public static Date getLastDayOfMonth() {
        Calendar calendar = Calendar.getInstance();// 获取当前日期
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendar.getTime();
    }

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd");
        System.out.println(getFirstDayOfLastMonth());
    }
}
