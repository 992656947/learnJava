package chapter12.src.com.njwb.exec;

public class Penguin extends Pet {


    //性别
    private String sex;

    public static final String FEMAIL="母";
    public static final String MALE="公";



    //构造方法
    public Penguin(){}



    public Penguin(String name, int health, int love, String sex){
        super(name,health,love);
        this.sex =sex;
    }





    public void setSex(String sex) {

        if("公".equals(sex) ||"母".equals(sex)) {
            this.sex  =sex ;
        }else{
            System.out.println("对不起，性别只能是公或者母。。。");
            this.sex = MALE;
        }

    }
    public String getSex(){
        return this.sex;
    }


    //非静态方法
    public  String getPenguinInfo(){
        return "企鹅的名字是："+name+",健康值："+health+",亲密度："+love+",性别"+sex;
    }



    public String info(){
        return "马化腾";
    }



    public boolean equals(Object obj) {
        if(this== obj) {
            return true;
        }
        if(obj instanceof Penguin) {
            Penguin otherPenguin = (Penguin) obj;
            if(this.name.equals(otherPenguin.name)&&this.sex.equals(otherPenguin.sex)) {
                return true;
            }
        }
        return false;
    }

}
