package chapter12.src.com.njwb.hashTable;

import javax.sql.rowset.spi.SyncResolver;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo01 {
    public static void main(String[] args) {
        Hashtable<String,String> hashtable = new Hashtable<>();
        hashtable.put("hello","world");
        hashtable.put("world","123");
        System.out.println(hashtable);

        Enumeration<String> enumKeys = hashtable.keys();
        while(enumKeys.hasMoreElements()){
            String key = enumKeys.nextElement();
            System.out.println(key);
        }

        Enumeration<String> enumValues = hashtable.elements();
        while (enumValues.hasMoreElements()) {
            String value = enumValues.nextElement();
            System.out.println(value);
        }
    }
}
