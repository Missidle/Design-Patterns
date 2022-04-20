package com.zph.designpatterns.factorypattern;

public class NvWa {
    public static void main(String[] args) {
        //声明阴阳八卦炉
//        AbstractHumanFactory YingYangLu = new HumanFactory();
        //女娲第一次造人火候不足，于是白人诞生了
        System.out.println("--造出的第一批是白色人种--");
//        Human whiteHuman = YingYangLu.createHuman(WhiteHuman.class);
//        Human whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        Human whiteHuman = (new WhiteHumanFactory()).createHuman();
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("--造出的第二批是黑色人种--");
//        Human blackHuman = YingYangLu.createHuman(BlackHuman.class);
//        Human blackHuman = HumanFactory.createHuman(BlackHuman.class);
        Human blackHuman = (new BlackHumanFactory()).createHuman();
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--造出的第三批是黄色人种--");
//        Human yellowHuman = YingYangLu.createHuman(YellowHuman.class);
//        Human yellowHuman = HumanFactory.createHuman(BlackHuman.class);
        Human yellowHuman = (new YellowHumanFactory()).createHuman();
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
