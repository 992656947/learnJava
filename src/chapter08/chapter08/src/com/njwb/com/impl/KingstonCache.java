package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Cache;

public class KingstonCache implements Cache {


    private int size ;

    public KingstonCache(int size) {
        this.size = size;
    }
    @Override
    public String getSize() {
        return "金士顿内存条:"+size+"G";
    }
}
