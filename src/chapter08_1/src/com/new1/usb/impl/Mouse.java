package chapter08_1.src.com.new1.usb.impl;

import com.new1.usb.IUsb;

public class Mouse implements IUsb {
    @Override
    public void service() {
        System.out.println("Mouse");
    }
}
