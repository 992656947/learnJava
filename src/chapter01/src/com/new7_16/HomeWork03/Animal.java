package chapter01.src.com.new7_16.HomeWork03;

public class Animal {
    protected int speed;
    protected String name;
        public Animal(int speed,String name) {
            this.speed = speed;
            this.name = name;
        }
        public int run(int length){
            return length/speed;
        }
}
