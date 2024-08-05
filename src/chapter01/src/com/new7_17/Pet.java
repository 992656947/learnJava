package chapter01.src.com.new7_17;

// 基本的Pet类
public abstract class Pet {
//    private String name;
//    private int age;
//    private int love;
//    private int health;
//
//    // 构造方法
//    public Pet(){}
//    public Pet(String name, int health,int love) {
//        this.name = name;
//        this.health = health;
//        this.love = love;
//    }
//
//    // Getter方法
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public int getLove() {
//        return love;
//    }
//    public int getHealth() {
//        return health;
//    }
//
//    // Setter方法
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void setLove(int love) {
//        this.love = love;
//    }
//    public  void setHealth(int health){this.health=health;}
// Pet.java

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void feed();
}



