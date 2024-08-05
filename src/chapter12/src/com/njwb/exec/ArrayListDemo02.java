package chapter12.src.com.njwb.exec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayListDemo02 {
    public static void main(String[] args) {

        List<Integer>  list = new ArrayList <Integer>();

        while(list.size()<6) {
            list.add(new Integer(new Random().nextInt(33)+1));
        }


        System.out.println(list);
    }
}
