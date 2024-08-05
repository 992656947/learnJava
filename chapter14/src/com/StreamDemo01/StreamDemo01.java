package com.StreamDemo01;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo01 {
    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println(list);
        List<String> listOfZhang = new ArrayList<>();
        for(String value :list){
            if (value.startsWith("张")){
                listOfZhang.add(value);
            }
        }
        for(String value :listOfZhang){
            System.out.println(value);
        }

    }

    public static List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("张三");
        return list;
    }
}
