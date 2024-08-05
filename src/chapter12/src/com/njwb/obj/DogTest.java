package chapter12.src.com.njwb.obj;

import com.njwb.exec.Dog;

public class DogTest {
    public static void main(String[] args) {

        Dog dog1 = new Dog("小强",100,100,"草狗");
        Dog dog2 = new Dog("小强",100,100,"草狗");
        System.out.println(dog1.equals(dog2));

    }
}
