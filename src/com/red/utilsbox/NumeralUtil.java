package com.red.utilsbox;

import java.text.DecimalFormat;

/**
 * 数字处理工具类
 * @author Red
 */
public class NumeralUtil {

    /**
     * 将数字按规定输出
     * @param obj 任意对象数字(int,double,float)
     * @param pattern 匹配模式
     *            <p>
     *            &nbsp;&nbsp;"#0.00%":保留两位小数的百分数;
     *            </p>
     *            <p>
     *            &nbsp;&nbsp;"#0.00\u2030":保留两位小数的千分数;
     *            </p>
     *            <p>
     *            &nbsp;&nbsp;"#.##":四舍五入保留两位小数;
     *            </p>
     *            <p>
     *            &nbsp;&nbsp;"#,###":将","作为分隔符间隔整数,省略小数;
     *            </p>
     *            <p>
     *            &nbsp;&nbsp;"\u00A4"或"¤":将数据以货币形式输出;
     *            </p>
     * @return 处理后的数字字符串
     */
    public static String getRound(Object obj, String pattern) {
        DecimalFormat format = new DecimalFormat(pattern);
        return format.format(obj);
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getRound(5896587.2654, "\u00A4#0.00"));
    }

}
