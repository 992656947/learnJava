package chapter12.src.com.njwb.IteratorDemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class IteratorDemo01 {
    public static void main(String[] args) {

        Collection<String> collection = new Vector();
        collection.add("aa");
        collection.add("bb");
        collection.add("cc");
        collection.add("dd");
        collection.add("ee");

        Iterator iterator = collection.iterator();
        for (String a : collection) {
            System.out.println(a);
        }
    }
}
