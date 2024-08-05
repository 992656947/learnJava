package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Cpu;

public class IntelCpu implements Cpu {


    public String getBrand() {
        return "intel cpu";
    }

    public double getPower() {
        return 3.2;
    }
}
