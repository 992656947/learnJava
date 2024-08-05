package chapter08.chapter08.src.com.njwb.usb.impl;

import com.njwb.usb.IUsb;

public class UsbFen implements IUsb {

    public void service(){
        System.out.println("usb电风扇开始工作了。。。。");
    }
}
