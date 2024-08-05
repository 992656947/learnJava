package chapter12.src.com.njwb.list;

import java.util.ArrayList;

public class ArrayListDemo02 {

    public static void main(String[] args) {
        //规定了该集合中只能添加字符串数据
        ArrayList<String> list= new ArrayList<String>();
        list.add("f");
        list.add("a");
        list.add("c");
        list.add("b");
        //开始取元素
        for(int i =0;i<list.size();i++) {
            String obj = list.get(i);
            System.out.println(obj);
        }
    }
}
