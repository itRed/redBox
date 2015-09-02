package com.red.utilsbox;

/**
 * 排序工具类
 * @author Red
 */
public class SortUtil {

    /**
     * 冒泡排序法为数组排序
     * @param values 数组
     */
    public static void bubbleUp(int[] values) {
        int temp;
        for (int i = 0; i < values.length; i++) {// 趟数
            for (int j = 0; j < values.length - i - 1; j++) {// 比较次数
                if (values[j] > values[j + 1]) {
                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
