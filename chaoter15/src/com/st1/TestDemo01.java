package com.st1;

public class TestDemo01 {
    public static void main(String[] args) {


        MyThread1 st1 = new MyThread1();
        st1.setName("线程A");
        MyThread2 st2 = new MyThread2();
        st2.setName("线程B");

        //线程的启动，需要调用start()=>交给java虚拟机区调用run方法。
        //自己去调用，就属于普通方法的调用。
        st1.start();
        st2.start();

    }
}
