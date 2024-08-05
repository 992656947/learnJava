package chapter12.src.com.njwb.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo03 {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<Person>(new PersonComparator());
        treeSet.add(new Person("双刀1",21));
        treeSet.add(new Person("双戟11",22));
        treeSet.add(new Person("长枪111",23));
        treeSet.add(new Person("匕首1111",24));
        for (Person p:treeSet){
            System.out.println(p);
        }

    }
}
class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1,Person o2) {
        return o2.getAge()-o1.getAge();
    }
}