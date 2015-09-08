package com.red.designPatterns.singleton;

/**
 * 单例模式之懒汉模式
 * @author Red
 */
public class SingletonMb {
    private static SingletonMb singletonMb = null;

    private SingletonMb() {

    }

    public static SingletonMb getInstance() {
        if (null == singletonMb) singletonMb = new SingletonMb();
        return singletonMb;
    }
}
