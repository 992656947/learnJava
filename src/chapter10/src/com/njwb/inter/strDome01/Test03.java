package chapter10.src.com.njwb.inter.strDome01;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuffer str = new StringBuffer();
        System.out.println("请输入一个字符串:");
        str.append(input.next().trim());
        System.out.println("请输入要查找的字符:");
        String userInput = input.next();
        char check = userInput.charAt(0);
        int count = 0;
        String str2 = str.toString();
        char[] arrayChar = str2.toCharArray();
        for(char a:arrayChar){
            if (a==check){
                count++;
            }
        }

        System.out.println(count);


    }
}
