package chapter01.src.com.new7_16.HomeWork01;

public class Bird extends Animal {
    private String color;

    public Bird(int age, String color) {
            super(age);
            this.color = color;
    }

    public void info() {
        System.out.println("找定一只" + color + "的鸟!");
        System.out.println("我今年" + super.getAge() + "岁了!");
        }
}