package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {

        Television tv1 = new Television("Zenith",25,DisplayType.CRT);
        //tv1.setBrand("Samsung");
        //tv1.setVolume(32);

        tv1.turnOn();
        tv1.turnOff();

        System.out.println(tv1.toString());
        //System.out.println(tv1);

        System.out.printf("%d television instances created" , Television.getInstanceCount());

        Television tv2 = new Television("Sony", 50);
        //tv2.setBrand("Sony");
        //tv2.setVolume(50);

        tv2.turnOn();
        tv2.turnOff();

        System.out.println(tv2);

        System.out.printf("%d television instances created" , Television.getInstanceCount());

        Television tv3 = new Television("LG");

        tv3.turnOn();
        tv3.turnOff();

        System.out.println(tv3);

        System.out.printf("%d television instances created" , Television.getInstanceCount());

        tv3.setDisplay(DisplayType.OLED);

        Television tv4 = new Television("Samsung", 40,DisplayType.PLASMA);
        System.out.println(tv4);
  }
}
