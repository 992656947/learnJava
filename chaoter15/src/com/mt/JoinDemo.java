package com.mt;

public class JoinDemo {
    public static void main(String[] args) {
        MyRunnable2 runnable2 = new MyRunnable2();
        for(int i = 1;i<15;i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
            if(i==5) {
                //创建线程
                Thread st = new Thread(runnable2,"半路杀出来线程");
                //启动线程
                st.start();
                try {
                    //阻塞指定线程等到另一个线程完成以后再继续执行
                    st.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}



class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for(int i = 1 ;i<=10;i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
