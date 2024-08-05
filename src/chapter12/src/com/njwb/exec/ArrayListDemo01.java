package chapter12.src.com.njwb.exec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        List<Penguin> list = new ArrayList<Penguin>();

        //添加数据
        list.add(new Penguin("小马",10,100,Penguin.FEMAIL));
        list.add(new Penguin("小黑",20,80,Penguin.FEMAIL));
        list.add(new Penguin("小白",30,56,Penguin.MALE));
        list.add(new Penguin("小强",40,77,Penguin.FEMAIL));
        System.out.println("一共有"+list.size()+"只企鹅");

        //输出
        System.out.println("使用增强的for循环输出");
        //增强的for循环
        for(Penguin penguin:list) {
            System.out.println(penguin.getPenguinInfo());
        }


        System.out.println("使用迭代器输出");
        Iterator<Penguin> iter = list.iterator() ;

        while(iter.hasNext()) {
            Penguin p = iter.next();
            System.out.println(p.getPenguinInfo());
        }


        list.remove(1);
        list.remove(1);
        System.out.println("移除后，还有"+list.size()+"只企鹅");
        for(Penguin penguin:list) {
            System.out.println(penguin.getPenguinInfo());
        }
        System.out.println("集合中包含小马吗？"+list.contains(new Penguin("小马",20,80,Penguin.FEMAIL)));


    }
}
