package com.st3;

public class OverThread {
    public static void main(String[] args) {
        MyRunnable1 runnable = new MyRunnable1();
        Thread thread = new Thread(runnable);

        //启动线程
        thread.start();

        try {
            //休眠
            Thread.sleep(1);
            System.out.println("休眠中....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        runnable.stopThread();
    }
}



class MyRunnable1 implements java.lang.Runnable {

    private boolean flag = true;
    @Override
    public void run() {
        while(flag) {
            System.out.println("线程开始执行中......");
        }
    }

    public void stopThread(){
        flag = false;
    }



}