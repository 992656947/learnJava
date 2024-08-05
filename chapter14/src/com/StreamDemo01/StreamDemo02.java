package com.StreamDemo01;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo02 {
    public static void main(String[] args) {
        List<String> list = getList();
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()>2).forEach(System.out::println);

    }

    public static List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("张三");
        list.add("张三丰");
        return list;
    }
}
