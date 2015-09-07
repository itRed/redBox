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

    /**
     * 效率高一点的选择排序
     * @param a
     */
    private static void selectionSort2(int[] a) {
        int k, temp;
        for (int i = 0; i < a.length; i++) {
            k = i;
            for (int j = k + 1; j < a.length; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
                if (k != i) {
                    temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
    }

    /**
     * 效率不高的选择排序
     * @param a
     */
    private static void selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    /**
     * 二分法查找算法
     * @param a
     * @param i
     * @return
     */
    private static int arraySearch(int[] a, int i) {
        if (a.length == 0) return -1;

        int startPos = 0;
        int endPos = a.length - 1;
        int m = (startPos + endPos) / 2;
        System.out.println(a[m]);
        while (startPos <= endPos) {
            if (a[m] == i) return m;
            if (a[m] < i) {
                startPos = m + 1;
            }
            if (a[m] > i) {
                endPos = m - 1;
            }
            m = (startPos + endPos) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
