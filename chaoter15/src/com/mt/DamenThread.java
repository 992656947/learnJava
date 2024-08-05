package com.mt;

public class DamenThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();

        for(int i =1;i<=10;i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("hello");
        }
    }
}