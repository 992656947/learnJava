package chapter12.src.com.njwb.coll;

import java.util.Collection;
import java.util.Vector;

public class CollectionDemo03 {

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

        //System.out.println(collection1);

        //collection1-collection2的元素，剩下的就是该方法的返回值->collection集合。
        //collection1.removeAll(collection2);

        System.out.println(collection1);

        //collection1和collection2的元素共同有的元素取出来形成一个集合
        collection1.retainAll(collection2);

        System.out.println(collection1);


        collection1.iterator();

    }
}
