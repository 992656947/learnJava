package chapter12.src.com.njwb.coll;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CollectionDemo04 {

    public static void main(String[] args) {

        //构建一个集合
        Collection collection1 = new Vector();
        collection1.add("aa");
        collection1.add("bb");
        collection1.add("cc");

        collection1.add("中国");
        collection1.add("美国");
        collection1.add("岛国");
        //获取一个迭代器
        Iterator iter = collection1.iterator();
        System.out.println("集合中的数据是：");
        while(iter.hasNext()) {
            String value =(String) iter.next();
            System.out.println(value);
        }

        System.out.println("-----------------使用foreach输出------------------");

        for(Object value:collection1) {
            System.out.println(value);
        }

    }
}
