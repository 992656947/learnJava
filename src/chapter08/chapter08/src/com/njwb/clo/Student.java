package chapter08.chapter08.src.com.njwb.clo;

public class Student implements Cloneable {
    public  Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    private String name ;
    private int age ;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String toString(){
        return "姓名："+this.name+",年龄："+this.age;
    }
}
