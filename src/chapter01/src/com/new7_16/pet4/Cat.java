package chapter01.src.com.new7_16.pet4;

// Cat类继承自Pet类
public class Cat extends Pet {
    private String color;

    // 构造方法
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    // Getter和Setter方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 重写makeSound方法
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
