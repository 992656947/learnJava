package chapter08_1.src.com.new1.door.impl;

import com.new1.door.Lock;

public class CommonLock implements Lock {
    @Override
    public void lockUp() {
        System.out.println("向右转3圈，上锁成功！");
    }

    @Override
    public void openLock() {
        System.out.println("向左转3圈，解锁成功！");
    }
}
