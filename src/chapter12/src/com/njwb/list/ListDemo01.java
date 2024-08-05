package chapter12.src.com.njwb.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo01 {

    public static void main(String[] args) {

        //创建了一个集合
        List list = new Vector();

        list.add("aa");
        list.add("bb");

        list.add(0,"cc");

        //输出一下list集合
        System.out.println("输出集合数据：");
        Iterator iter = list.iterator() ;
        while(iter.hasNext()) {
            Object value = iter.next();
            System.out.println(value);
        }

        System.out.println("获取当前集合第2个元素："+list.get(2));
        //如果索引超出长度size(java.lang.ArrayIndexOutOfBoundsException),报错 （Vector->数组）
        //System.out.println("获取当前集合第2个元素："+list.get(3));

        list.remove("aa");
        list.remove(1);
        System.out.println("集合现有的元素还剩下："+list);
    }
}
