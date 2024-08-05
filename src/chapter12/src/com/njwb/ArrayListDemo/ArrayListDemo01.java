package chapter12.src.com.njwb.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (String i : list) {
            System.out.println(i); // 打印列表中的元素
        }
    }
}
