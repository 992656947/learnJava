package chapter12.src.com.njwb.list;

import java.util.ArrayList;

public class ArrayListDemo03 {
    public static void main(String[] args) {


        ArrayList list= new ArrayList();
        list.add("f");
        list.add("a");
        list.add("c");
        list.add("b");


        System.out.println("集合中包含f字符串吗？"+list.contains("f"));
    }
}
