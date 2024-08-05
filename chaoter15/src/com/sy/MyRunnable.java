package com.sy;

public class MyRunnable implements Runnable {
    private Account account;
    public MyRunnable(Account account){
        this.account=  account;
    }

    @Override
    public void run() {
        while(account.getBalance()>=100){
            getMoneyFromAccount();
        }
    }

//    public synchronized void getMoneyFromAccount(){
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        account.setBlance(account.getBlance()-100);
//        System.out.println(Thread.currentThread().getName()+"取走了100元,剩下："+account.getBlance());
//    }

    public  void getMoneyFromAccount(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        account.setBalance(account.getBalance()-100);
        System.out.println(Thread.currentThread().getName()+"取走了100元,剩下："+account.getBalance());
    }

}
