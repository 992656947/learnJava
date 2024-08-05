package chapter12.src.com.njwb.list;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        list.add("f");
        list.add("a");
        list.add("c");
        list.add("b");


        //将集合转换成一个Object类型的数组
        Object[] objs = list.toArray();
        for(Object obj:objs) {
            System.out.println(obj);
        }

        System.out.println("-----------------------------------");
        //使用带参的方法返回数组
        Object[] objs2 = list.toArray(new Object[list.size()]);
        for(Object obj:objs2) {
            System.out.println(obj);
        }




        //传递一个排序的策略
        list.sort(new MyComparator());
        System.out.println(list);


    }


    static class MyComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            //字符在字典的顺序规则进行排序
            return o1.compareTo(o2);
        }
    }
}
