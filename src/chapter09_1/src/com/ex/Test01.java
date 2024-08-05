package chapter09_1.src.com.ex;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        if( in.hasNextInt()) {
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            if(in.hasNextInt()) {
                int num2 = in.nextInt();
                if(num2!=0) {
                    System.out.println(String.format("%d / %d = %d",
                            num1, num2, num1/ num2));
                    System.out.println("感谢使用本程序！");
                }else{
                    System.out.println("除数不能为0");
                }
            }else{
                System.out.println("输入数字不合法");
            }
        }else{
            System.out.println("输入数字不合法");
        }
    }
}
