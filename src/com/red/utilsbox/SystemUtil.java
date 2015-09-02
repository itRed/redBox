package com.red.utilsbox;

import java.io.File;

/**
 * 系统属性工具类
 * @author Red
 * @author it_red@sina.com
 * @version 1.0
 */
public class SystemUtil {

    /**
     * 获取当前工作目录
     * @return 目录字符串 eg:C:
     */
    public static String getRootDirectory() {
        String path = System.getProperty("user.dir");
        String rootdir = path.substring(0, path.indexOf(File.separator));
        return rootdir;
    }

    /**
     * 判断当前操作系统是否为windows目录
     * @return 是windows返回true,否则返回false. eg:true/false
     */
    public static boolean isWindows() {
        return System.getProperty("os.name").toLowerCase().contains("win") ? true : false;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(System.getProperties());
        System.out.println(isWindows());
    }

}
