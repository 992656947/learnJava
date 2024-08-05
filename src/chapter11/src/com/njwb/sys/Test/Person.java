package chapter11.src.com.njwb.sys.Test;

public class Person {
    private Person(){
        System.out.println(this+"对象出生。。");
    }
    private static Person instance;
    public static Person getInstance(){
        if (instance==null){
            instance = new Person();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}
