package com.HomeWork7_18_3;

public class Test {
    public static void main(String[] args) {
        Car Audi = new Audi("奥迪");
        Car SmartAudi = new SmartAudi("智能奥迪");
        Audi.run();
        SmartAudi.run();
        ((SmartAudi) SmartAudi).automaticDrive();
        ((SmartAudi) SmartAudi).automaticParking();
    }
}
