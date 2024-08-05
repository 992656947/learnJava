package com.HomeWork7_22_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tools tools = new Tools();
        String str = input.next();
        if(tools.isEmpty(str)){
            System.out.println("不能输入为空!");
        }else{
            tools.setName(str);
            System.out.println("name="+tools.getName());
        }
        String newOne = tools.join(new String[]{"hello","你好"},"+");
        System.out.println("拼接："+newOne);

    }
}
