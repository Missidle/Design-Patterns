package com.zph.designpatterns.factorypattern;

public class YellowHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
