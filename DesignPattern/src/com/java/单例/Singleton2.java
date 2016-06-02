package com.java.单例;

/**
 * 懒汉式单例
 * Created by think on 2016/6/2.
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    private static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
