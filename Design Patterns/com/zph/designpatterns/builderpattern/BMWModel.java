package com.zph.designpatterns.builderpattern;

public class BMWModel extends CarModel{
    @Override
    protected void start() {
        System.out.println("宝马车跑起来是这样子的....");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停车应该是这样子的....");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车的喇叭声是这个样子的....");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车的引擎声是这个声音的....");
    }
}
