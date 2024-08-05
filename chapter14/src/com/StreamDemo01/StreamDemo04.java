package com.StreamDemo01;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo04 {
    public static void main(String[] args) {
        List<String> list = getList();
//        System.out.println(list);
//
//        System.out.println("----------------");
//        list.stream().limit(2).forEach(System.out::println);
//
//        System.out.println("----------------");
//        list.stream().skip(2).limit(2).forEach(System.out::println);
//
//        System.out.println("----------------");
//        list.stream().skip(4).limit(2).forEach(System.out::println);

//        Stream s1 = Stream.of("aa","bb","cc");
//        Stream s2 = Stream.of("aa","bb","cc");
//        Stream s3 =Stream.concat(s1,s2);
////        s3.forEach(System.out::println);
//        s3.distinct().forEach(s->System.out.println(s));

//        Stream<Integer> s1 = Stream.of(33,44,55,66,77,88,22,11);
////        s1.sorted().forEach(s-> System.out.println(s));
////        s1.sorted((a1,a2)->a2-a1).forEach(System.out::println);
//
////        s1.map(i->i+"hello").forEach(System.out::println);
//        System.out.println(s1.filter(i->i>50).allMatch(s->s>54));
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
