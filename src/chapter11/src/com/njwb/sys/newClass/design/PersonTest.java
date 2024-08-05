package chapter11.src.com.njwb.sys.newClass.design;

public class PersonTest {

    public static void main(String[] args) {

        //一旦构造器私有化后，便无法在外部创建对象了--->对象的创建权转移到类的内部

        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        Person p3 = Person.getInstance();
        Person p4 = Person.getInstance();
        Person p5 = Person.getInstance();
        Person p6 = Person.getInstance();
        Person p7 = Person.getInstance();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
        System.out.println(p7);


    }
}
