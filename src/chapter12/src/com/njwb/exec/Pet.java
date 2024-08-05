package chapter12.src.com.njwb.exec;

//父类
public abstract class Pet {
    protected String name =getParentInitData();
    //健康值
    protected int health;
    //与主人的亲密度
    protected int love;


    static{
        //System.out.println("父类静态代码块执行了");
    }

//    {
//        System.out.println("父类的普通代码块执行了");
//    }

    public String getParentInitData(){
        //System.out.println("父类属性初始化");
        return "" ;
    }

    public Pet() {

        //System.out.println("父类构造方法执行了");
    }

    public Pet(String name){
        this();
        this.name = name;
    }
    public Pet(String name, int health){
        this(name);
        this.health = health ;
    }

    public Pet(String name, int health, int love){
        this(name,health);
        this.love = love ;
    }


    //set方法一般用于赋值
    public void setName(String name) {
        this.name = name ;
    }
    //get方法一般用于取值
    public String getName(){
        return this.name ;
    }



    public void setHealth(int health) {
        if(health<0) {
            System.out.println("健康值不能为小于0");
            this.health = 0 ;

        }else{
            this.health = health ;
        }

    }

    public int getHealth(){
        return this.health ;
    }
    public void setLove(int love) {
        if(love<0) {
            System.out.println("亲密度不能为小于0");
            this.love = 0 ;
        }else{
            this.love = love ;
        }
    }
    public int getLove(){
        return this.love ;
    }



    public abstract String info() ;
}
