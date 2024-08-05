package chapter01.src.com.new7_16.dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("111",3,100,"小狗");
        dog.setName("张三");
        Dog.location = "ssss";
        String a = dog.getName();
        System.out.println(a);
        System.out.println(dog.info());
        System.out.println(Dog.a);

    }
}
