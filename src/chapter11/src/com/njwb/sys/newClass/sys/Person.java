package chapter11.src.com.njwb.sys.newClass.sys;

public class Person {

    private String name ;


    public Person() {
        System.out.println("出生了");
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //对象在被垃圾收集之前做的一些收尾操作。
    public void finalize() throws Throwable {
        System.out.println("升天了");
        super.finalize();
    }
}
