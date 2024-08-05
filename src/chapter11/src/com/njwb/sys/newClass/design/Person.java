package chapter11.src.com.njwb.sys.newClass.design;

public class Person {


    //构造器私有化
    private Person() {
        System.out.println(this+"对象出生了");
    }

    //属性
    private  static  Person instance = new Person() ;

    //提供公开的接口
    public static Person getInstance() {

        return instance;
    }

}
