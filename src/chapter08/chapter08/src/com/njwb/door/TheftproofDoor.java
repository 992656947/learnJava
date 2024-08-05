package chapter08.chapter08.src.com.njwb.door;

public class TheftproofDoor extends Door implements Photoable  {


    private Lock lock ;

    public TheftproofDoor() {
    }

    public TheftproofDoor(Lock lock) {
        this.lock = lock;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }


    //解锁
    public void openLock(){
        lock.openLock();
    }

    //上锁
    public void lockUp(){
        lock.lockUp();
    }


    public void takePhoto() {
        System.out.println("开启拍照....");
    }


}
