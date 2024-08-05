package chapter08_1.src.com.new1.door.impl;

import com.new1.door.Lock;

public class CipherDoor implements Lock {
    @Override
    public void lockUp() {
        System.out.println("正在加密，上锁成功！");
    }

    @Override
    public void openLock() {
        System.out.println("正在解密，解锁成功！");
    }
}
