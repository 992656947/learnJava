package com.st4;

public class TicketTest {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();

        Thread st1 = new Thread(sellTicket,"苏州");
        Thread st2 = new Thread(sellTicket,"无锡");
        Thread st3 = new Thread(sellTicket,"常州");

        st1.start();
        st2.start();
        st3.start();

    }
}
