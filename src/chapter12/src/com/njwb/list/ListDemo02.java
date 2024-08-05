package chapter12.src.com.njwb.list;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListDemo02 {

    public static void main(String[] args) {

        //创建了一个集合
        List list = new Vector();

        list.add("aa");
        list.add("bb");
        list.add("cc");



        List list2 = new Vector();
        list2.add("灌篮高手");
        list2.add("圣斗士星矢");
        list2.add("灌篮高手");

        list.addAll(1,list2);
        System.out.println(list);

        //查找某个元素在集合中的位置，如果不存在，返回-1.
        int index = list.indexOf("灌篮高手");
        System.out.println(index==-1?"不存在":"在集合中的位置是："+index);


        int index2 = list.lastIndexOf("灌篮高手");
        System.out.println(index2==-1?"不存在":"在集合中的位置是："+index2);

        //获取一个子集
        System.out.println(list.subList(0,4));
    }
}
