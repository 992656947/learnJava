package chapter08.chapter08.src.com.njwb.usb.impl;

import com.njwb.usb.IUsb;

public class Mouse implements IUsb {
    public void service(){
        System.out.println("鼠标开始工作了");
    }
}
