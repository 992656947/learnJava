package chapter11.src.com.njwb.sys.enumTest;

import java.io.Serializable;

public class Student implements Serializable {
    private  String Name;
//    private String sex;
    private Gander gander;

    public Student() {

    }

    public Student(String name, Gander gander) {
        Name = name;
        this.gander = gander;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Gander getGander() {
        return gander;
    }

    public void setGander(Gander gander) {
        this.gander = gander;
    }
}
