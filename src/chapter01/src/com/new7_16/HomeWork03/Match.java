package chapter01.src.com.new7_16.HomeWork03;

import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        System.out.println("请输入跑了多少米");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        Rabbit ribbit = new Rabbit(100,"兔子");
        Tortoise tortoise = new Tortoise(20,"王八");
        begin begin = new begin(ribbit.name,tortoise.name,ribbit.run(length), tortoise.run(length));

    }
}
class begin {
    begin(String r,String t,int a, int b) {
        System.out.println(r+"用时"+a);
        System.out.println(t+"用时"+b);
    }
}