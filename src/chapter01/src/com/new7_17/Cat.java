package chapter01.src.com.new7_17;

// Cat.java
public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the cat is eating cat food.");
    }
}
