package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test06 {
    public static void main(String args[]){
        int i =1;
        int sum = 0;
        for(;i<11;i++){
            sum = sum + i;
            if(sum>20){
                System.out.println("当i="+i+"时，累加为20");
                break;
            }
        }

    }
}
