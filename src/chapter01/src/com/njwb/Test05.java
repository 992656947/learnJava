package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test05 {
    public static void main(String args[]){

        double nums = 250000;
        int years = 0;
        while ((int)nums < 1000000){
            nums = nums *1.25;
            years ++;
        }
        System.out.println(years);

    }
}
