package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Cpu;

public class AmdCpu implements Cpu {
    @Override
    public String getBrand() {
        return "AMD";
    }

    @Override
    public double getPower() {
        return 4.8;
    }
}
