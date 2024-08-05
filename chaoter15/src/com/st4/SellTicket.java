package com.st4;

public class SellTicket implements Runnable {
    private  Ticket ticket = new Ticket();

    @Override
    public void run() {
        while (ticket.getCount()>0){
            sellTicket();
        }
    }
    public void  sellTicket(){
        if(ticket.getCount()>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket.setCount(ticket.getCount()-1);
            System.out.println(Thread.currentThread().getName()+"卖了一张票，还剩"+ticket.getCount()+"张");
        }else {
            System.out.println("票已经买完！");
        }
    }

}
