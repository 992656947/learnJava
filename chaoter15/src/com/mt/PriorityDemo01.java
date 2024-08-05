package com.mt;

public class PriorityDemo01 {
    public static void main(String[] args) {
        Priority priority = new Priority();

        Thread st1 = new Thread(priority,"1号选手");
        Thread st2 = new Thread(priority,"2号选手");
        Thread st3 = new Thread(priority,"3号选手");

        //优先级修改
        st1.setPriority(Thread.MIN_PRIORITY);
        st2.setPriority(Thread.MAX_PRIORITY);
        st3.setPriority(Thread.NORM_PRIORITY);

        //启动
        st1.start();
        st2.start();
        st3.start();

        System.out.println(Thread.currentThread().getName()+"优先级是："+Thread.currentThread().getPriority());
        for(int i =1;i<=20;i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+":"+i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }


    }
}


class Priority implements  Runnable{
    @Override
    public void run() {
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