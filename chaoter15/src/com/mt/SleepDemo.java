package com.mt;

public class SleepDemo {
    public static void main(String[] args) {
        new Thread(new MyRunnable(),"sleep方法测试").start();
    }

}


class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1 ;i<=10;i++) {
            try {
                //睡个1秒钟后在开始做事情
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
