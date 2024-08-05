package chapter01.src.com.new7_15.biz;

import java.util.Scanner;

public class stu {
    Scanner input = new Scanner(System.in);
    String[] names = new String[3];

    public void input(){
        for(int i =0;i<names.length;i++){
            System.out.println("输入"+(i+1)+"学生姓名：");
            names[i] = input.next();
        }
    }


}
