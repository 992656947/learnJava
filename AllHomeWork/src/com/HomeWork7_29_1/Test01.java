package com.HomeWork7_29_1;

import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0;i<20;i++){
            list.add(random.nextInt(5));
        }
        System.out.println(list);

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<list.size();i++){
            Integer value = list.get(i);
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }else{
                map.put(value,1);
            }
        }
        System.out.println(map);

    }
}
