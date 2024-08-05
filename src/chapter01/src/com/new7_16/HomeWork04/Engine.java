package chapter01.src.com.new7_16.HomeWork04;

public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void work() {
        System.out.println(power + "功率的发动机在运转");
    }
}



//// 测试类
//public class Main {
//    public static void main(String[] args) {
//        // 创建引擎对象
//        Engine engine = new Engine(300);
//
//        // 创建奔驰对象，并设置引擎
//        Benz benz = new Benz();
//        benz.setEngine(engine);
//
//        // 创建驾驶员对象
//        Driver driver = new Driver("张三");
//
//        // 驾驶员开奔驰车
//        driver.driveCar(benz);
//    }
//}

