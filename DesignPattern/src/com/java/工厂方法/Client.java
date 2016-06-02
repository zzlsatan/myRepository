package com.java.工厂方法;

/**
 * 调用
 * Created by think on 2016/6/2.
 */
public class Client {

    public static void main(String [] args){
        IFactory factory = new Factory();
        IProduct product = factory.createProduct();
        product.productMethod();
    }
}
