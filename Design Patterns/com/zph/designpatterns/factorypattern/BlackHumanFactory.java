package com.zph.designpatterns.factorypattern;

public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
