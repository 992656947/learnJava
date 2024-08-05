package chapter08.chapter08.src.com.njwb.comp;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        int[] nums = {41,4,51,3,31,22};
        Arrays.sort(nums);
        for(int value:nums) {
            System.out.println(value);
        }


        //创建一个dvd数组
        Dvd[] dvds = new Dvd[3] ;
        //为dvd数组的元素赋值
        dvds[0] = new Dvd("越狱",0,10,"");
        dvds[1] = new Dvd("IRIS",0,5,"");
        dvds[2] = new Dvd("热辣滚烫",1,67,"2024-7-1");


        Arrays.sort(dvds);

        System.out.println("dvd的信息如下：");
        for(int i = 0 ;i<dvds.length;i++) {
            if(dvds[i]!=null) {
                System.out.println((i+1)+"、"+dvds[i].dvdInfo());
            }
        }

    }
}
