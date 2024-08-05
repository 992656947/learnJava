package com.sy;

public class Account {
    private int balance = 500;

//    public int getBlance() {
//        return blance;
//    }
//
//    public void setBlance(int blance) {
//        this.blance = blance;
//    }

    public synchronized int getBalance() {
        return balance;
    }

    public synchronized void setBalance(int balance) {
        this.balance = balance;
    }


}
