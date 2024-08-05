package chapter12.src.com.njwb.ListDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo01 {
    public static void main(String[] args) {
        List list = new Vector();
        list.add("aa");
        list.add("bb");
        list.add(0,"cc");
//        for( Object a:list){
//            System.out.println(a);
//        }
//        Iterator iter = list.iterator();
//        while (iter.hasNext()){
//            System.out.println(iter.next());
//        }

//        System.out.println(list.get(0));
//        list.remove("aa");
//        list.remove(1);
//        System.out.println(list);

        int index = list.indexOf("aa");
        System.out.println(index);

        System.out.println(list.subList(0,2));

    }
}
