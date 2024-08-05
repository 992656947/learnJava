package chapter12.src.com.njwb.coll;

import java.util.Collection;
import java.util.Vector;

public class CollectionDemo01 {

    public static void main(String[] args) {

        //构建一个集合
        Collection collection = new Vector();
        System.out.println("集合的长度是:"+collection.size());
        System.out.println("集合为空吗？"+collection.isEmpty());

        //向集合中添加数据
        collection.add(5);
        collection.add("abc");
        collection.add(true);

        System.out.println("集合中现有的数据是："+collection);

        System.out.println("现在集合的长度是："+collection.size());

        //清空集合中的数据
        //collection.clear();
        //System.out.println("数据清空后，集合中现有的数据是："+collection);


        //判断集合中是否包含某个元素
        System.out.println("集合中包含abc字符串吗？"+collection.contains("abc"));
        System.out.println("集合中包含bcd字符串吗？"+collection.contains("bcd"));

        collection.remove("abc");
        System.out.println(collection);
        System.out.println("移除abc后，集合中还存在abc吗？"+collection.contains("abc"));


    }
}
