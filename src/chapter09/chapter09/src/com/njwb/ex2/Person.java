package chapter09.chapter09.src.com.njwb.ex2;

public class Person {
    private String name ;

    private int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //非RuntimeException
    public void setAge(int age) throws AgeErrException{
        if(age<=0||age>150){
            throw new AgeErrException("年龄只能在0-150之间");
        }
        this.age = age;
    }

    public String toString(){
        return "姓名："+name+",年龄："+age;
    }
}
