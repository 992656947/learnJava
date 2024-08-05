package chapter12.src.com.njwb.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo03 {
    public static void main(String[] args) {
        Set<Person> set   = new HashSet<>();



        Person p1 = new Person("zhangsan",12);

        Person p2 =new Person("zhangsan",12);
        Person p3 =new Person("zhangsan",12);
        Person p4 =new Person("zhangsan",12);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p4));

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        System.out.println(p4.hashCode());


        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);


        System.out.println(set.size());


        for(Person p:set) {
            System.out.println(p);
        }

    }
}
