package chapter12.src.com.njwb.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {

        //set无序且唯一
        Set set = new HashSet();
        set.add("c");
        set.add("a");
        set.add("a");
        set.add("a");
        set.add("a");

        set.add("b");
        set.add("b");
        set.add("b");

        System.out.println(set);



        List list = new ArrayList();
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("a");

        list.add("b");
        list.add("b");
        list.add("b");


        System.out.println(list);



    }
}
