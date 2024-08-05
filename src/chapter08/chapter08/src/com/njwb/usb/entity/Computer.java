package chapter08.chapter08.src.com.njwb.usb.entity;

import com.njwb.usb.IUsb;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Computer {

    //多态
    public void pluign(IUsb iusb)  {
        iusb.service();
    }
}
