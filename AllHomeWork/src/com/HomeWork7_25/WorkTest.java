package com.HomeWork7_25;

import java.util.*;

public class WorkTest {
    public static void main(String[] args) {
        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("zhang3", 18, 3000));
        workerList.add(new Worker("li4", 25, 3500));
        workerList.add(new Worker("wang5", 22, 3200));

//        2) 在li4 之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300
        workerList.add(1,new Worker("zhao6", 24, 3300));

//        3) 删除wang5 的信息
        workerList.removeIf(work ->work.getName().equals("wang5"));

//        4) 利用for 循环遍历，打印List 中所有工人的信息
        System.out.println("for 循环遍历");
        for(Worker worker:workerList){
            System.out.println(worker.toString());
        }

//        5) 利用迭代遍历，对List 中所有的工人调用work 方法。
        System.out.println("迭代遍历");
        Iterator<Worker> iter = workerList.iterator();
        while(iter.hasNext()){
            String p = iter.next().work();
            System.out.println(p);
        }

//        6）现在要把Worker 类放入HashSet 中，并希望在HashSet中没有重复元素。假定工人的姓名，年龄，还有工资都一样我们就认为是重复元素。
        System.out.println("HashSet");
        Set<Worker> workerSet = new HashSet<>(workerList);
        for(Worker worker:workerSet){
            System.out.println(worker);
        }

//        7) 现在要把Work放入到TreeSet类中，此时定义的比较规则。
//        注：比较时，先比较工人年龄大小，年龄小的排在前面。如果两个工人年龄相同，则再比较其收入，收入少的排前面。如果年龄和收入都相同，则根据字典顺序比较工人姓名。
        Set<Worker> workerTreeSet = new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker w1, Worker w2) {
                int ageCompare = Integer.compare(w1.getAge(), w2.getAge());
                if (ageCompare != 0) {
                    return ageCompare;
                }
                int salaryCompare = Double.compare(w1.getSalary(), w2.getSalary());
                if (salaryCompare != 0) {
                    return salaryCompare;
                }
                return w1.getName().compareTo(w2.getName());
            }
        });

        workerTreeSet.addAll(workerList);
        System.out.println("TreeSet的内容:");
        for (Worker worker : workerTreeSet) {
            System.out.println(worker);
        }
    }
}


