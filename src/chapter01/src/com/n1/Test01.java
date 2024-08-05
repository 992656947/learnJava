package chapter01.src.com.n1;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String[] game = {"剪刀", "石头", "布"};
        String[] aiName = {"刘备", "孙权", "曹操"};
        boolean is_flag = true;
        while (is_flag) {
            int aiCount = 0;
            int userCount = 0;
            int peaceCount = 0;
            Random random = new Random();
            int randomNumber = -1;
            System.out.println("****************");
            System.out.println("**猜拳！开始！**");
            System.out.println("****************");
            System.out.println("出拳规则：1.剪刀\t2.石头\t3.布");
            System.out.print("请选择对方角色(1.刘备\t2.孙权\t3.曹操)");
            int AiIndex = input.nextInt();
            System.out.println();
            System.out.print("请输入你的名字:");
            String UserName = input.next();
            System.out.println();
            System.out.print("要开始吗？(y/n)");
            String start = input.next();
            System.out.println();
            if ("n".equals(start)) {
                continue;
            }
            if ("y".equals(start)) {
                while (is_flag) {
                    System.out.print("请出拳：1.剪刀\t2.石头\t3.布\t(输入相应数字)");
                    int num = input.nextInt();
                    System.out.println();
                    System.out.println("你出拳：" + game[num - 1]);
                    randomNumber = random.nextInt(3);
                    System.out.println(aiName[AiIndex - 1] + "出拳:" + game[randomNumber]);
                    if (AiIndex - 1 == randomNumber) {
                        System.out.println("结果说：^-^，平局捏！");
                        peaceCount = peaceCount + 1;
                    } else if (AiIndex - 1 == 2 & randomNumber == 1) {
                        System.out.println("结果说：^-^，你输了，真笨！");
                        aiCount = aiCount + 1;
                    } else {
                        System.out.println("结果说：^-^，你赢了，真牛！");
                        userCount = userCount + 1;
                    }
                    System.out.print("是否开始下一轮（y/n）");
                    String nextOne = input.next();
                    System.out.println("----------------------------------------");
                    if ("y".equals(nextOne)) {
                        continue;
                    } else if ("n".equals(nextOne)) {
                        System.out.println(aiName[AiIndex - 1] + "\tVS\t" + UserName);
                        System.out.println("对战次数：" + (aiCount + userCount + peaceCount));
                        System.out.println("姓名\t得分");
                        System.out.println(UserName + "\t" + userCount);
                        System.out.println(aiName[AiIndex - 1] + "\t" + aiCount);
                        is_flag = false;
                    } else {
                        System.out.println("输入错误!");
                    }
                    System.out.println();
                }
//                } else{
//                    System.out.println("输入错误！");
//                }
            }
        }
    }
}