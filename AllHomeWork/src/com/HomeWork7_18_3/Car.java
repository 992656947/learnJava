package com.HomeWork7_18_3;

public class Car {
    protected String name;
    public void run(){
        System.out.println(this.name+"可以跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Car(String name) {
        this.name = name;
    }
}
