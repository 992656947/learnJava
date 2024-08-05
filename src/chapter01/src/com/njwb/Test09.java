package chapter01.src.com.njwb;

import java.util.Scanner;

public class Test09 {
    public static void main(String arg[]){
        double money[] = new double[5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员本月的消费记录");
        for (int i=0;i<money.length;i++){
            System.out.println("输入第"+(i+1)+"笔购物金额：");
            money[i] = input.nextDouble();
        }
        double sum =0;
        System.out.println("序号\t"+"金额");
        for(int i=0;i<money.length;i++){
            System.out.println(i+1+"\t"+money[i]);
            sum += money[i];
        }
        System.out.println("总金额\t"+sum);




        System.out.println();
    }

}
