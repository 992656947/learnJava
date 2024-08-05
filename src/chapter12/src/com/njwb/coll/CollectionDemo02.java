package chapter12.src.com.njwb.coll;

import java.util.Collection;
import java.util.Vector;

public class CollectionDemo02 {

    public static void main(String[] args) {

        //构建一个集合
        Collection collection1 = new Vector();

        collection1.add("aa");
        collection1.add("bb");
        collection1.add("cc");

        Collection collection2 = new Vector();

        collection2.add("中国");
        collection2.add("美国");
        collection2.add("岛国");

        //addAll它会将collection2中的每个元素抽取出来，放入集合中
        collection1.addAll(collection2);
        //add它会将collection2作为一个整体放入集合中。
        collection1.add(collection2);

        System.out.println("集合1的数据是："+collection1);


        collection1.remove("中国");
        System.out.println("集合1中的数据是："+collection1);

        //collection2里面有的元素，如果在集合1中出现，此时将其移除。
        collection1.removeAll(collection2);
        System.out.println("集合1中的数据是："+collection1);


    }
}
