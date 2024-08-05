package chapter08_1.src.com.new1.door;

public class TheftproofDoor extends Door implements TakePhoto {
    private Lock lock;

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

    public void openLock(){
        this.lock.openLock();
    }
    public void lockUp(){
        this.lock.lockUp();
    }

    @Override
    public void takePhoto() {
        System.out.println("拍照");
    }
}
