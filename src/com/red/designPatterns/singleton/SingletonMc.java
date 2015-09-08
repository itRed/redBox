package com.red.designPatterns.singleton;

/**
 * 双重锁形式
 * @author Red
 */
public class SingletonMc {

    private static SingletonMc singletonMc = null;

    private SingletonMc() {

    }

    public static SingletonMc getInstance() {
        if (null == singletonMc) {
            synchronized (SingletonMc.class) {
                if (null == singletonMc) singletonMc = new SingletonMc();
            }
        }
        return singletonMc;
    }
}
