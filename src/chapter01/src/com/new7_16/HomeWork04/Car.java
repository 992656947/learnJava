package chapter01.src.com.new7_16.HomeWork04;

public class Car {
    private Engine engine;  // 引擎

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void run() {
        if (engine == null) {
            System.out.println("发动机发动不了");
        } else {
            engine.work();
            System.out.println(engine.getPower() + "功率的发动机在运转, 汽车在跑");
        }
    }
}
