package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Disk;

public class SeagateDisk implements Disk {

    private int size ;

    public SeagateDisk(int size) {
        this.size = size;
    }
    @Override
    public String getSize() {
        return "希捷-"+size+"G";
    }
}
