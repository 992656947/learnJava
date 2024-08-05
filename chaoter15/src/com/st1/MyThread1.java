package com.st1;

public class MyThread1 extends Thread {

    @Override
    public void run(){
        for(int i = 1;i<=100;i++) {
            System.out.println(this.getName()+"正在打印："+i);
        }
    }

}
