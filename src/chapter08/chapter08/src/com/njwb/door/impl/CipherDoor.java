package chapter08.chapter08.src.com.njwb.door.impl;

import com.njwb.door.Lock;

public class CipherDoor implements Lock {
    public void lockUp() {
        System.out.println("正在加密...上锁成功");
    }


    public void openLock() {
        System.out.println("正在解密，解锁成功");
    }
}
