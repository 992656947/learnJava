package chapter12.src.com.njwb.list;

import java.util.LinkedList;

public class LinkedListDemo02 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //压栈
        list.push("aa");
        list.push("bb");
        list.push("cc");
        System.out.println(list);


        Object first = list.pop();
        System.out.println(first);
        System.out.println(list);
        Object second = list.pop();
        System.out.println(second);
        System.out.println(list);

        Object three = list.pop();
        System.out.println(three);
        System.out.println(list);


        Object four = list.pop();
        System.out.println(four);
        
    }
}
