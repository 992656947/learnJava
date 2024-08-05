package com.StreamDemo01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo06 {
    public static void main(String[] args) {
        List<String> list = getList();
        Stream<Integer> s1 = Stream.of(33,44,55,66,77,88,22,11);
        int sum = s1.reduce((a,b)->a+b).get();
        System.out.println(sum);

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
