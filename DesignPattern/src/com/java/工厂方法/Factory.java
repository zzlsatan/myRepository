package com.java.工厂方法;

/**
 * 工厂实现类
 * Created by think on 2016/6/2.
 */
public class Factory implements IFactory{

    @Override
    public IProduct createProduct() {
        return new Product();
    }
}
