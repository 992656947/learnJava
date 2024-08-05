package chapter01.src.com.njwb;

import java.util.Scanner;

/*
* 选择题：
* Capter01:B C C D D AD B C B AD
* Capter02:AD CD BD D AC BD AD A C ACD
* Capter03:C B C D BCD A AB B B C C B BD 全错没有正确选项
* **/

public class HomeWork1 {
    public static void main(String args[]){

        System.out.println();
        //Capter01 编程题
        //1
//        boolean is_flag = true;
//        while (is_flag){
//            Scanner input = new Scanner(System.in);
//            System.out.println("请输入硬币的正反面[正面or反面]");
//            String guess ;
//            guess = input.next();
//            if ("反面".equals(guess)){
//                System.out.println("出去爬山");
//                is_flag = false;
//            }else if("正面".equals(guess)){
//                System.out.println("看Java书");
//                is_flag = false;
//            }else{
//                System.out.println("输入错误请重新输入");
//            }
//        }

        //2
//            Scanner input = new Scanner(System.in);
//            System.out.println("请输入打篮球人数：");
//            int num;
//            num = input.nextInt();
//            if (num<10){
//                System.out.println("打半场！");
//            }else{
//                System.out.println("打全场！");
//            }
        //3
//            Scanner input = new Scanner(System.in);
//            System.out.println("请输入你的体温：");
//            double temp;
//            temp = input.nextDouble();
//            if (temp<38){
//                System.out.println("一切正常！");
//            }else{
//                System.out.println("去医院挂点滴！");
//            }
        //4

//                Scanner input = new Scanner(System.in);
//                System.out.print("输入时间（小时）：");
//                int hour = input.nextInt();
//                if (hour < 12) {
//                    System.out.println("提交作业不会受到处罚");
//                } else {
//                    System.out.println("抄代码20遍");
//                }

//---------------------------------------------------------------------
        //Capter02 编程题
        //1
//        int cardA,cardB,tmp;
//        cardA = 10;
//        cardB = 8;
//        System.out.println("输出互换前手中的纸牌：");
//        System.out.println("左手中的纸牌："+cardA);
//        System.out.println("右手中的纸牌："+cardB);
//        tmp = cardA;
//        cardA = cardB;
//        cardB = tmp;
//        System.out.println("输出互换后手中的纸牌：");
//        System.out.println("左手中的纸牌："+cardA);
//        System.out.println("右手中的纸牌："+cardB);

        //2
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入当前的华氏度：");
//        Double degree = input.nextDouble();
//        Double new_degree = (degree - 32)*5/9;
//        System.out.println("当前的摄氏度："+ new_degree);

        //3
//        Scanner input = new Scanner(System.in);
//
//        double rateOneYear = 2.25 / 100;
//        double rateTwoYears = 2.70 / 100;
//        double rateThreeYears = 3.24 / 100;
//        double rateFiveYears = 3.60 / 100;
//
//        System.out.print("请输入本金：");
//        double principal = input.nextDouble();
//
//        double amountOneYear = principal + principal * rateOneYear * 1;
//        double amountTwoYears = principal + principal * rateTwoYears * 2;
//        double amountThreeYears = principal + principal * rateThreeYears * 3;
//        double amountFiveYears = principal + principal * rateFiveYears * 5;
//
//        // 输出结果
//        System.out.printf("存取一年后的本息是：%.2f%n", amountOneYear);
//        System.out.printf("存取二年后的本息是：%.2f%n", amountTwoYears);
//        System.out.printf("存取三年后的本息是：%.2f%n", amountThreeYears);
//        System.out.printf("存取五年后的本息是：%.2f%n", amountFiveYears);


        //4④求2的N次方的值，计算表达式为(int)Math.pow(2.0,(double)n);
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入要求2的多少次方：");
//        int n = input.nextInt();
//        int result = (int) Math.pow(2, n);
//        System.out.printf("2的%d次方: %d%n", n, result);

//----------------------------------------------------------------
        //Capter03 编程题
        //1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入一个年份: ");
//        int year = scanner.nextInt();
//
//        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + "是闰年");
//        } else {
//            System.out.println(year + "不是闰年");
//        }

        //2
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入总分: ");
//        int score = scanner.nextInt();
//        System.out.print("请输入爱好 (java 或 C#): ");
//        String hobby = scanner.next();
//
//        if (score > 500) {
//            System.out.println("进入快班");
//        } else {
//            System.out.println("进入慢班");
//        }
//
//        if (hobby.equalsIgnoreCase("java")) {
//            System.out.println("学习jsp, SSH");
//        } else if (hobby.equalsIgnoreCase("C#")) {
//            System.out.println("学习ASP.Net");
//        } else {
//            System.out.println("未知爱好");
//        }

        //3
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入今天星期几 (1-7): ");
//        int day = scanner.nextInt();
//
//        switch(day) {
//            case 1:
//            case 3:
//            case 5:
//                System.out.println("去学校上课");
//                break;
//            case 2:
//            case 4:
//            case 6:
//                System.out.println("到学校机房上自习");
//                break;
//            default:
//                System.out.println("休息");
//                break;
//        }

        //4
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("请输入成绩: ");
//        int score = scanner.nextInt();
//
//        if (score >= 90) {
//            System.out.println("等级是A");
//        } else if (score >= 80) {
//            System.out.println("等级是B");
//        } else if (score >= 60) {
//            System.out.println("等级是C");
//        } else {
//            System.out.println("等级是D");
//        }
    }
}
