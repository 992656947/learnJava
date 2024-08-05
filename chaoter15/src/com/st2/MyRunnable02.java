package com.st2;

public class MyRunnable02 implements Runnable {
    @Override
    public void run() {
        for(int i =101;i<=200;i++) {
            System.out.println(Thread.currentThread().getName()+"正在打印："+i);
        }
    }
}
