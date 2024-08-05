package chapter08_1.src.com.new1.door;

import com.new1.door.impl.CipherDoor;
import com.new1.door.impl.CommonLock;

public class TestDoor {
    public static void main(String[] args) {
        Lock lock = new CommonLock();
        TheftproofDoor theftproofDoor = new TheftproofDoor(lock);
        theftproofDoor.openLock();
        theftproofDoor.open();

        theftproofDoor.takePhoto();


        theftproofDoor.lockUp();
        theftproofDoor.close();

        lock = new CipherDoor();
        theftproofDoor = new TheftproofDoor(lock);

        theftproofDoor.openLock();
        theftproofDoor.open();


        theftproofDoor.lockUp();
        theftproofDoor.close();



    }
}
