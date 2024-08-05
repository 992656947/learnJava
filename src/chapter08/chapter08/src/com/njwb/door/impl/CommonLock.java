package chapter08.chapter08.src.com.njwb.door.impl;

import com.njwb.door.Lock;

public class CommonLock implements Lock {


    public void lockUp() {
        System.out.println("向右转3圈，上锁成功！！！");
    }


    public void openLock() {
        System.out.println("向左转3圈，解锁成功！！！");
    }

}
