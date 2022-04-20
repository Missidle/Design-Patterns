package com.zph.designpatterns.factorypattern;

public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色人种的肤色是白色的!");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说话，一般都是单字节的");
    }
}
