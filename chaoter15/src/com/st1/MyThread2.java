package com.st1;

public class MyThread2 extends Thread {

    @Override
    public void run(){
        for(int i = 101;i<=200;i++) {
            System.out.println(this.getName()+"正在打印："+i);
        }
    }

}
