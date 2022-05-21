package com.zph.designpatterns.builderpattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
//        BenzModel benz = new BenzModel();

//        ArrayList<String> sequence = new ArrayList<String>();
//        sequence.add("Engine Boom");
//        sequence.add("start");
//        sequence.add("stop");
//
//        BenzBuilder benzBuilder = new BenzBuilder();
//        benzBuilder.setSequence(sequence);
//        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
//        benz.run();
//
//        BWMBuilder bwmBuilder = new BWMBuilder();
//        bwmBuilder.setSequence(sequence);
//        BMWModel bwm = (BMWModel) bwmBuilder.getCarModel();
//        bwm.run();


//        benz.setSequence(sequence);
//        benz.run();

        Director director = new Director();
        //1W辆A类型的奔驰车
        for (int i = 0; i<10000; i++){
            director.getABenzModel().run();
        }

        //100W辆B类型的奔驰车
        for (int i = 0; i<1000000 ;i++){
            director.getBBenzModel().run();
        }

        //1000W辆C类型的宝马
        for (int i = 0; i<1000000; i++){
            director.getCBWMModel().run();
        }
    }
}
