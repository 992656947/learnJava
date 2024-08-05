package chapter12.src.com.njwb.Dome01;

import java.util.Collection;
import java.util.Vector;

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection collection = new Vector();
        System.out.println(collection.isEmpty());

        collection.add("acb");
        collection.add(5);
        collection.add(true);

        System.out.println(collection);
        System.out.println(collection.contains("abb"));
        System.out.println(collection.contains("abc"));
        System.out.println(collection.size());
        System.out.println(collection.remove("abc"));
    }
}
