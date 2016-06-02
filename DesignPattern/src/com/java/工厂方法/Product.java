package com.java.工厂方法;

/**
 * 产品实现类
 * Created by think on 2016/6/2.
 */
public class Product implements IProduct {
    @Override
    public void productMethod() {
        System.out.println("产品");
    }
}
