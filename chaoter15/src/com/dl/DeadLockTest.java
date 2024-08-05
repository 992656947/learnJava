package com.dl;

public class DeadLockTest {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();

        Thread th1 = new Thread(deadLock,"1号");
        Thread th2 = new Thread(deadLock,"2号");

        th1.start();
        th2.start();


    }
}

class DeadLock implements  Runnable{
    @Override
    public void run() {
        if("1号".equals(Thread.currentThread().getName())){
            synchronized ("钱"){
                System.out.println("11111111111");
                synchronized ("3号"){
                    System.out.println("31313131313");
                }
            }
        }else if("2号".equals(Thread.currentThread().getName())){
                    synchronized ("3号"){
                        System.out.println("32323232323");
                        synchronized ("钱"){
                            System.out.println("222222222222");
                        }
                    }
        }
    }
}
