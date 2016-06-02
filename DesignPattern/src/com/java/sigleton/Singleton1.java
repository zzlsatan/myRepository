package com.java.sigleton;

/**
 * 饿汉式单例
 * Created by think on 2016/6/2.
 */
public class Singleton1 {
    private static Singleton1 singleton = new Singleton1();
    private Singleton1(){
    }
    public static Singleton1 getInstance(){
        return singleton;
    }

}
