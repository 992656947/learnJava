package chapter12.src.com.njwb.exec;

public class Dog extends Pet  {
    //品种
    private String strain;
    //构造方法
    public Dog(){}

    public Dog(String name, int health, int love, String strain){

        super(name,health,love);
        this.strain =strain;

    }



    public void setStrain(String strain) {
        this.strain  =strain ;
    }
    public String getStrain(){
        return this.strain;
    }


    //非静态方法
    public  String dogInfo(){
        return "宠物的名字是："+super.getName()+",健康值："+super.getHealth()+",亲密度："+super.getLove()+",品种"+this.getStrain();
    }



    public  String info()  {
        return "我是一只单身狗";
    };




    public boolean equals(Object obj) {
        if(this== obj) {
            return true;
        }
        if(obj instanceof Dog) {
           Dog otherDog = (Dog) obj;
           if(this.name.equals(otherDog.name)&&this.strain.equals(otherDog.strain)) {
               return true;
           }
        }
        return false;
    }


}
