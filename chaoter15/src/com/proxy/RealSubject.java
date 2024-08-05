package com.proxy;

public class RealSubject implements Subject {

    @Override
    public void getMoney() {
        System.out.println("求求你还钱。。。。");
    }


}
