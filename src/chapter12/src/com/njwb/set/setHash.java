package chapter12.src.com.njwb.set;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setHash {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("1");
        set.add("1");
        set.add("2");
        System.out.println(set.size());
        System.out.println(set);

        Iterator iter = set.iterator();
        while (iter.hasNext()){
            Object obj = iter.next();
            System.out.println(obj);
        }

    }
}
