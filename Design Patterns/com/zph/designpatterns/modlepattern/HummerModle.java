package com.zph.designpatterns.modlepattern;

public abstract class HummerModle {

    public abstract void start();

    public abstract void stop();

    public abstract void alarm();

    public abstract void engineBoom();

   final public void run() {
        this.start();
        this.engineBoom();

        if (this.isAlarm()){
            this.alarm();
        }

        this.stop();
    }

    protected boolean isAlarm(){
       return true;
    }
}
