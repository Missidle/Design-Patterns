package com.zph.designpatterns.modlepattern;

public class HummerH2Model extends HummerModle{
    @Override
    public void start() {
        System.out.println("悍马H2发动......");
    }

    @Override
    public void stop() {
        System.out.println("悍马2停车.......");
    }

    @Override
    public void alarm() {
        System.out.println("悍马2鸣笛......");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马2的引擎声是这样子的.......");
    }

    protected boolean isAlarm(){
        return false;
    }
}
