package chapter12.src.mapDome;

import java.util.*;

public class HashMapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("cn","中国");
        map.put("jp","日本");
        map.put("uk","英国");
        System.out.println(map.containsKey("cn"));
//        map.clear();
        System.out.println(map.containsValue("日本"));

//        Set<String> set = map.keySet();
//        for(String key:set){
//            System.out.println(map.get(key));
//        }
//
//        Collection<String> list = map.values();
//        System.out.println(list);
//
//        Set<Map.Entry<String,String>>  entrySet = map.entrySet();
//        Iterator<Map.Entry<String,String>> iter = entrySet.iterator();
//        while (iter.hasNext()){
//            Map.Entry<String,String>  entry = iter.next();
//            System.out.println(entry.getKey()+"-->"+entry.getValue());
//        }
    }
}
