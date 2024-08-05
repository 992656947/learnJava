package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test01 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入Java成绩");
        int scoreOfJava = input.nextInt();
        System.out.println("请输入SQL成绩");
        int scoreOfSQL = input.nextInt();
        System.out.println("请输入Redis成绩");
        int scoreOfRedis = input.nextInt();
        int score = 0;
        score = (scoreOfJava+scoreOfRedis+ scoreOfSQL)/3;
        System.out.println("你的平均分为："+score);
    }


}
