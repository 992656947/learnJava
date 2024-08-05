package chapter12.src.com.njwb.list;

import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("aa");
        list.add("bb");
        //在最前面添加元素
        list.addFirst("cc");
        System.out.println("list:"+list);
        //在链表最后添加元素
        list.addLast("ff");
        System.out.println(list);
        System.out.println("获取集合的第一个元素："+list.getFirst());
        System.out.println("获取集合的最后一个元素："+list.getLast());
        list.removeFirst();
        System.out.println("移除集合的第一个元素后："+list);
        list.removeLast();
        System.out.println("移除集合的最后一个元素后："+list);


    }
}
