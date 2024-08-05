package com.lambda;

public class LambdaTest04 {
    public static void main(String[] args) {

        Sleepable sleepable = new Sleepable() {
            @Override
            public void sleep() {
                System.out.println("11111");
            }
        };
        System.out.println(sleepable.getClass());

        Sleepable sleepable2 = ()->{
            System.out.println("2222");
        };

        System.out.println(sleepable2.getClass());


    }
}

interface Sleepable{
    public void sleep();
}