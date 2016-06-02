package com.java.抽象工厂;

/**
 * 产品1实现类
 * Created by think on 2016/6/2.
 */
public class Product1 implements IProduct1{
    @Override
    public void show() {
        System.out.println("这是1型产品");
    }
}
