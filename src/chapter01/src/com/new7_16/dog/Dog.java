package chapter01.src.com.new7_16.dog;

public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;
    public static String location;
    public static final int a = 1;
    public String info(){
        return "宠物名:"+name + "\t健康值:"+health+"\t亲密度:"+love+"\t品质:"+strain+"\t所属地："+location;
    }
    public Dog(){}
    public Dog(String name){
        this();
        this.name = name;
    }
    public Dog(String name,int health){
        this(name);
        this.health = health;
    }
    public Dog(String name,int health,int love){
        this(name,health);
        this.love = love;
    }
    public Dog(String name,int health,int love,String strain){
        this(name,health,love);
        this.strain = strain;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
