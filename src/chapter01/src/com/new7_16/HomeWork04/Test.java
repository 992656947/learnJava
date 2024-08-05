package chapter01.src.com.new7_16.HomeWork04;

public class Test {
    public static void main(String[] args) {
        Engine engine = new Engine(300);

        Benz benz = new Benz();
        benz.setEngine(engine);

        Driver driver = new Driver("张三");

        driver.driveCar(benz);
    }
}
