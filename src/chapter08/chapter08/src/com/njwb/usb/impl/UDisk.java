package chapter08.chapter08.src.com.njwb.usb.impl;

import com.njwb.usb.IUsb;

public class UDisk implements IUsb {
    public void service(){
        System.out.println("u盘开始传输数据了。。。。");
    }
}
