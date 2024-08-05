package com.mt;


public class YieldDemo {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread2().start();
    }




    static class  MyThread1 extends Thread {
        public MyThread1(){
            this.setName("线程1");
        }
        @Override
        public void run() {
            for(int i = 1 ;i<=10;i++) {
                System.out.println(this.getName()+":"+i);
                Thread.yield();
            }
        }
    }

    static class  MyThread2 extends Thread {
        public MyThread2(){
            this.setName("线程2");
        }
        @Override
        public void run() {
            for(int i = 1 ;i<=10;i++) {
                System.out.println(this.getName()+":"+i);
                //让出cpu执行权->继续参与竞争
                Thread.yield();
            }
        }
    }

}
