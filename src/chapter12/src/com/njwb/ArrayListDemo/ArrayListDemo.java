package chapter12.src.com.njwb.ArrayListDemo;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");

        Object[] objs = list.toArray();
        for (Object a : objs){
            System.out.println(a);
        }
        Object[] obj2 = list.toArray(new Object[list.size()]);
        for (Object a : obj2){
            System.out.println(a);
        }
//        list.sort(MyComparator);


    }

//    static class MyComparator implements Comparable<String>{
//        public int compare(String o1,String o2){
//            return o1.compareTo(o2);
//        }
//    }
}
