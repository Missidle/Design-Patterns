package com.zph.designpatterns.builderpattern;

import java.util.ArrayList;

public class Director {
    private ArrayList<String> sequence = new ArrayList<String>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BWMBuilder bwmBuilder = new BWMBuilder();

    public BenzModel getABenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel(){
        this.sequence.clear();
        this.sequence.add("engine Boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getCBWMModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bwmBuilder.setSequence(this.sequence);
        return (BMWModel) this.bwmBuilder.getCarModel();
    }

    public BMWModel getDBWMModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bwmBuilder.setSequence(this.sequence);
        return (BMWModel) this.bwmBuilder.getCarModel();
    }
}
