package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test02 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4位会员卡号：");
        int num = input.nextInt();
//        int num = 1234;
        int a,b,c,d;
        a = num%10;
        b = (num%100-a)/10;
        c = (num%1000-a-b*10)/100;
        d = num/1000;
        int mySum = a+b+c+d;
        System.out.println("会员卡号"+num+"各位之和："+mySum);
        System.out.println("是幸运用户嘛？");
        if (mySum>20){
            System.out.println("Ture");
        }else{
            System.out.println("False");

        }


    }
}
