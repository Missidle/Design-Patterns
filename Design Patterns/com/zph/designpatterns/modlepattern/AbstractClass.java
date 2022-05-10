package com.zph.designpatterns.modlepattern;

public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething1();

    //基本方法
    protected  abstract  void doSomething2();

    //模板方法
    public void templateMethod(){
        /**
         * 基本调用方法，完成相关逻辑
         */

        this.doSomething1();
        this.doSomething2();
    }



}
