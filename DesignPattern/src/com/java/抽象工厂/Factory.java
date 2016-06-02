package com.java.抽象工厂;

/**
 * Created by think on 2016/6/2.
 */
public class Factory implements IFactory {
    @Override
    public IProduct1 createProduct1() {
        return new Product1();
    }

    @Override
    public IProduct2 createProduct2() {
        return new Product2();
    }
}
