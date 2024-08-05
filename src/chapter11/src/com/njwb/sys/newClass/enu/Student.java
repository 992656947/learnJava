package chapter11.src.com.njwb.sys.newClass.enu;

import java.io.Serializable;

public class Student implements Serializable {
    private String name ;

    private Gender sex ;

    public Student() {
    }

    public Student(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
//        if(sex.equals("男")||sex.equals("女")){
//            this.sex = sex ;
//        }else{
////            this.sex = "男";
//
//        }
        this.sex  = sex ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
