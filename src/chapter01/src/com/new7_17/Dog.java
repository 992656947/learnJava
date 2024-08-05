package chapter01.src.com.new7_17;

// Dog.java
public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void feed() {
        System.out.println(getName() + " the dog is eating dog food.");
    }
}
