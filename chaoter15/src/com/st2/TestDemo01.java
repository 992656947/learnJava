package com.st2;

public class TestDemo01 {
    public static void main(String[] args) {
        MyRunnable01 runnable01 = new MyRunnable01();
        MyRunnable02 runnable02 = new MyRunnable02();
        //不管采用哪种方式，线程的启动必须依靠start方法
        Thread st01 = new Thread(runnable01,"hello线程");
        Thread st02 = new Thread(runnable01,"world线程");
        //启动线程
        st01.start();
        st02.start();
    }
}
