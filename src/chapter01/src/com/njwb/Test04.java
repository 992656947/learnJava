package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test04 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入分数：");
        int score = input.nextInt();
        if (score==100){
            System.out.println("爸爸给他买辆车");
        }else if(score>=90){
            System.out.println("妈妈发他买MP4");
        }else if (score>=60){
            System.out.println("妈妈给他买参考书");
        }else{
            System.out.println("什么都不买");
        }
    }
}
