package chapter12.src.com.njwb.set;

import java.util.TreeSet;

public class TreeSetDemo01 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("c");
        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("a");
        treeSet.add("a");
        treeSet.add("a");
        treeSet.add("b");
        treeSet.add("1");
        treeSet.add("5");
        treeSet.add("55");
        treeSet.add("555");


        System.out.println(treeSet);

    }
}
