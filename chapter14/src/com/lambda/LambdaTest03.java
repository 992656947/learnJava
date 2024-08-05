package com.lambda;

public class LambdaTest03 {

    public static void main(String[] args) {
        useEatable(new Pig(), "苹果");

        useEatable((food) -> {
            System.out.println("猪正在吃" + food);
        }, "苹果");

        useEatable(new Eatable() {
            @Override
            public void eat(String food) {
                System.out.println("猪正在吃" + food);
            }
        }, "苹果");


    }

    public static void useEatable(Eatable eatable, String food) {
        eatable.eat(food);
    }

    static class Pig implements Eatable {
        @Override
        public void eat(String food) {
            System.out.println("猪正在吃" + food);
        }
    }




}

interface Eatable {
    void eat(String food);
}
