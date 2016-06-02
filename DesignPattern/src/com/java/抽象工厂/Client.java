package com.java.抽象工厂;
/**
 * 客户端调用
 * Created by think on 2016/6/2.
 */
public class Client {

    public static void main(String [] args){
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
