package com.zph.designpatterns.singletonpattern;

/**
 * 单例模式
 */
public class Emperor {
    private static final Emperor emperor = new Emperor();

    private  Emperor(){

    }

    public static Emperor getInstance(){
        return emperor;
    }

    public static void say(){
        System.out.println("我是皇帝某某某...........");
    }
}
