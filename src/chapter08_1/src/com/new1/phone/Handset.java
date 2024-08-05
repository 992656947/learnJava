package chapter08_1.src.com.new1.phone;

public abstract class Handset {
    protected String brand;
    protected String type;

    public Handset(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public void call() {
        System.out.println("Calling...");
    }

    public void sendInfo() {
        System.out.println("Sending info...");
    }

    public abstract void info();
}
