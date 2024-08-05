package chapter01.src.com.new7_16.pet4;

// Dog类继承自Pet类
public class Dog extends Pet {
    private String breed;

    // 构造方法
    public void Dog(){}
    public Dog(String name, int age, String breed) {
        super(name, age);  // 调用父类Pet的构造方法
        this.breed = breed;
    }

    // Getter和Setter方法
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // 重写makeSound方法
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

