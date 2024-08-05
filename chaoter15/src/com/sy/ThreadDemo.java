package com.sy;

public class ThreadDemo {
    public static void main(String[] args) {
        Account account = new Account();

        MyRunnable myRunnable = new MyRunnable(account);

        Thread th1 = new Thread(myRunnable,"1号");
        Thread th2 = new Thread(myRunnable,"2号");
        Thread th3 = new Thread(myRunnable,"3号");
        Thread th4 = new Thread(myRunnable,"4号");

        th1.start();
        th2.start();
        th3.start();
        th4.start();


    }
}
