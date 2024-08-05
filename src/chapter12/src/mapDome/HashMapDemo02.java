package chapter12.src.mapDome;

import com.njwb.exec.Dog;
import com.njwb.exec.Pet;

import java.util.*;

public class HashMapDemo02 {
    public static void main(String[] args) {
        Map<String, List<Pet>> map = new HashMap<>();
        map.put("南京", Arrays.asList(new Dog("111",1,1,"111"),new Dog("22",2,2,"22")));
        map.put("北京", Arrays.asList(new Dog("111",1,1,"111"),new Dog("22",2,2,"22")));

        Set<String> set = map.keySet();
        System.out.println(set);

        Set<Map.Entry<String,List<Pet>>>  entrySet = map.entrySet();
        Iterator<Map.Entry<String,List<Pet>>> iter = entrySet.iterator();
        while (iter.hasNext()){
            Map.Entry<String,List<Pet>>  entry = iter.next();
                    List<Pet> list = entry.getValue();
            String key = entry.getKey();
            for(Pet p:list){
                if(p instanceof  Dog){
                    Dog dog = (Dog) p;
                    System.out.println(dog.dogInfo());
                }
            }
        }


    }
}
