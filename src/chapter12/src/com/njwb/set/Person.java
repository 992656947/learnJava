package chapter12.src.com.njwb.set;

public class Person implements Comparable<Person>{
    private String name ;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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

    @Override
    public int hashCode(){
        return this.name.hashCode()*this.age*32;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this) {
            return true;
        }
        if(obj instanceof Person) {
            Person arg = (Person) obj;
            if(arg.name.equals(this.name) &&arg.age==this.age) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int compareTo(Person o) {
        return o.age;
    }
}
