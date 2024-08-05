package chapter01.src.com.new7_16.HomeWork01;

public abstract class Animal {
    private int age;
        public Animal(int age) {
            this.age = age;
        }
        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
            return age;
        }


    public abstract void info();
}
