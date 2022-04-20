package com.zph.designpatterns.singletonpattern;

/**
 * 单例模式，通用模板
 *
 */
public class SingletonPattern {
    private static final  SingletonPattern singletonPattern = new SingletonPattern();
    //限制产生多个对象
    private SingletonPattern (){

    }

    //通过该方法获得实力对象
    public static SingletonPattern getInstance(){
        return  singletonPattern;
    }

    //类其他方法，尽量是static
    public static void doSomething(){

    }
}
