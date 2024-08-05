package chapter08.chapter08.src.com.njwb.door;

import com.njwb.door.impl.CipherDoor;
import com.njwb.door.impl.CommonLock;

public class TestDoor {

    public static void main(String[] args) {
        //普通锁
        Lock lock = new CommonLock();
        TheftproofDoor theftproofDoor = new TheftproofDoor(lock);
        theftproofDoor.takePhoto();
        theftproofDoor.openLock();
        theftproofDoor.open();

        theftproofDoor.lockUp();
        theftproofDoor.close();

        System.out.println("-----------------------");
        //开始换一把锁
        lock = new CipherDoor();
        theftproofDoor = new TheftproofDoor(lock);

        theftproofDoor.takePhoto();
        theftproofDoor.openLock();
        theftproofDoor.open();

        theftproofDoor.lockUp();
        theftproofDoor.close();


    }
}
