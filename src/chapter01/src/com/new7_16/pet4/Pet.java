package chapter01.src.com.new7_16.pet4;

// 基本的Pet类
public abstract class Pet {
    private String name;
    private int age;

    // 构造方法
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 一个基本的方法
    public abstract void makeSound();
}

