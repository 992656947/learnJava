package com.st2;

public class MyRunnable01 implements Runnable {
    @Override
    public void run() {
        for(int i =1;i<=100;i++) {
            System.out.println(Thread.currentThread().getName()+"正在打印："+i);
        }
    }
}
