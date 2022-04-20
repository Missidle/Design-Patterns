package com.zph.designpatterns.singletonpattern;

public class Ministers {
    public static void main(String[] args) {
        int ministerNum = 5;
        for (int i = 0; i<ministerNum; i++){
            EmperorExpand emperor = EmperorExpand.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是: ");
            emperor.say();
        }
    }
}
