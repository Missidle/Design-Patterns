package com.zph.designpatterns.builderpattern;

import java.util.ArrayList;

public class BWMBuilder extends CarBuilder{
    private BMWModel bwm = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
       this.bwm.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bwm;
    }
}
