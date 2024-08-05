package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Disk;

public class ElementDisk implements Disk {
    private int size ;

    public ElementDisk(int size) {
        this.size = size;
    }
    @Override
    public String getSize() {
        return "西部数据:"+size+"G";
    }
}
