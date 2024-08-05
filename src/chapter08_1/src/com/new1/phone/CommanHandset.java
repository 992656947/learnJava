package chapter08_1.src.com.new1.phone;

public class CommanHandset extends Handset {
    public CommanHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void info() {
        System.out.println("Feature phone info: " + brand + " " + type);
    }
}
