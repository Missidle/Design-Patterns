package com.zph.designpatterns.modlepattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) throws IOException {
        HummerH1Model h1Model = new HummerH1Model();
        System.out.println("-----------H1型号------------");
        System.out.println("H1型号的悍马是否需要喇叭声响? 0 - 不需要   1 - 需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        if (type.equals("0")){
            h1Model.setAlarm(false);
        }
        h1Model.run();

        System.out.println("-----------H2型号------------");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
