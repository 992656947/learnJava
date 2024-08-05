package com.lambda;

public class LamdbaTest {
    public static void main(String[] args) {
        Computer computer = new Computer();

//        computer.plugin(new UDisk());

//        computer.plugin(new IUsb() {
//            @Override
//            public void service() {
//                System.out.println("u盘开始传输数据了。。。。");
//            }
//        });

        computer.plugin(()->
                System.out.println("u盘开始传输数据了。。。。"));


    }
}


class Computer{
    public void plugin(IUsb usb){
        usb.service();
    }
}

