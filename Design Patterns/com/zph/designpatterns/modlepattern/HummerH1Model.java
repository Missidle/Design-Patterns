package com.zph.designpatterns.modlepattern;

public class HummerH1Model extends HummerModle{
    private boolean alarmFlag = true;
    @Override
    public void start() {
        System.out.println("悍马H1发动....");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车......");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛.......");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马1引擎声是这样子的.......");
    }

    protected boolean isAlarm(){
        return this.alarmFlag;
    }
    public void setAlarm(boolean isAlarm){
        this.alarmFlag = isAlarm;
    }
}
