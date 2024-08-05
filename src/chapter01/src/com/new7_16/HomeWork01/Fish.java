package chapter01.src.com.new7_16.HomeWork01;

public class Fish extends Animal{
    private double weight;
    public Fish(int age ,double weight){
        super(age);
        this.weight = weight;
    }
    public void info() {
        System.out.println("我是一只" + weight + "斤重的鱼!");
        System.out.println("我今年" + super.getAge() + "岁了!");
    }
}
