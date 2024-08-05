package com.Flayable01;

public class LambdaTest02 {


    public static  void useFlyable(Flyable flyable){
        flyable.fly();
    }

    public static void main(String[] args) {
        useFlyable(new BirdMan());
        useFlyable(new Flyable() {
            @Override
            public void fly() {
                System.out.println("啊啊啊啊啊");
            }
        });

        useFlyable(()->
                System.out.println("钱钱钱"));

        useFlyable(()->{
            System.out.println("aaaaaaaaaaa");
        });

    }


    static class BirdMan implements Flyable{
        public void fly(){
            System.out.println("飞飞飞飞");
        }
    }

}

interface Flyable{
    public void fly();
}