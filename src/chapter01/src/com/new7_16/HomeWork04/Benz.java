package chapter01.src.com.new7_16.HomeWork04;

public class Benz extends Car {
    public void run() {
        if (getEngine() == null) {
            System.out.println("奔驰的发动机发动不了");
        } else {
            getEngine().work();
            System.out.println(getEngine().getPower() + "功率的发动机在运转, 奔驰在跑");
        }
    }
}
