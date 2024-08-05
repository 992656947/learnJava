package com.st3;

public class Runnable {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread();
        thread.start();
        try{
            Thread.sleep(1);
            System.out.println("休眠中...");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        runnable.stopTread();
    }
}


class MyRunnable implements java.lang.Runnable{
    private boolean flag =true;
    @Override
    public void run() {
        while (flag){
            System.out.println("正在执行...");
        }

    }
    public void stopTread(){
        flag = false;
    }
}