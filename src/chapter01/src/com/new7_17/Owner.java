package chapter01.src.com.new7_17;

// Owner.java
public class Owner {

    public void feedPet(Pet pet) {
        pet.feed();
    }

    public static void main(String[] args) {
        Pet myDog = new Dog("Buddy");
        Pet myCat = new Cat("Whiskers");

        Owner owner = new Owner();
        owner.feedPet(myDog);
        owner.feedPet(myCat);
    }
}
