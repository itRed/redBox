package com.red.utilsbox;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtil {

	/**
	 * 将当前日期按指定格式输出
	 * 
	 * @param pattern
	 *            格式：yyyy-MM-dd HH:mm:ss(可以使用任意符号隔开，HH:24小时;hh:12小时)
	 * @return 格式化后的字符串
	 * @author Red
	 */
	public static String formateDate(String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		// DateFormat sd=DateFormat.getDateInstance(DateFormat.FULL,
		// Locale.getDefault());按照本地系统模式输出
		// return sd.format(new Date());
		return sdf.format(new Date());
	}

	// public static String

	public static void main(String[] args) {
		System.out.println(formateDate("yyyy.MM.dd HH:mm:ss"));
	}
}
