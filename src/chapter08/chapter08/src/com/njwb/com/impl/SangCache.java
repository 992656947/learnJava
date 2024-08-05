package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Cache;

public class SangCache implements Cache {

    private int size ;

    public SangCache(int size) {
        this.size = size;
    }
    @Override
    public String getSize() {
        return "三星内存条:"+size+"G";
    }
}
