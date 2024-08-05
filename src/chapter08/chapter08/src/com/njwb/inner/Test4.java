package chapter08.chapter08.src.com.njwb.inner;

import com.njwb.usb.IUsb;
import com.njwb.usb.impl.UDisk;

public class Test4 {
    public static void main(String[] args) {

        IUsb usb = new IUsb(){
            public void service(){
                System.out.println("正在使用usb服务。。。");
            }
        };


    }
}



