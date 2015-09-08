package com.red.designPatterns.singleton;

/**
 * 单例模式之饿汉模式
 * @author Red
 */
public class SingletonMa {
    private static final SingletonMa SINGLETON_MA = new SingletonMa();

    private SingletonMa() {

    }

    public static SingletonMa getInstance() {
        return SINGLETON_MA;
    }
}
