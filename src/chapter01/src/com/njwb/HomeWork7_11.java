package chapter01.src.com.njwb;
import java.util.Scanner;
/*
* chapter1:B B C D A A B C D BC
* chapter2:AC BD D C C C D D BC A
* **/
public class HomeWork7_11 {
       public static void main(String arg[]){
           //1.
//           int count = 1;
//           while(count < 101){
//                if( count % 7==0){
//                    System.out.print(count+" ");
//                }else if(count % 13==0){
//                    System.out.print(count+" ");
//                }
//                count ++;
//           }

           //2
//           int count = 2;
//           while (count < 101) {
//               boolean isPrime = true;
//               int i = 2;
//
//               // 判断是否是质数
//               while (i <= count / 2) {
//                   if (count % i == 0) {
//                       isPrime = false;
//                       break;
//                   }
//                   i++;
//               }
//
//               if (isPrime) {
//                   System.out.println(count + " 是质数");
//               }
//               count++;
//           }
           //3
//                   Scanner scanner = new Scanner(System.in);
//
//                   System.out.println("请输入年份:");
//                   int year = scanner.nextInt();
//
//                   System.out.println("请输入月份:");
//                   int month = scanner.nextInt();
//
//                   System.out.println("请输入日期:");
//                   int day = scanner.nextInt();
//                   int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//
//                   boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//                   if (isLeapYear) {
//                       daysInMonth[1] = 29;
//                   }
//                   int dayOfYear = 0;
//                   for (int i = 0; i < month - 1; i++) {
//                       dayOfYear += daysInMonth[i];
//                   }
//                   dayOfYear += day;
//                   System.out.println("这一天是这一年的第 " + dayOfYear + " 天。");
        //--------------------------
           Scanner scanner = new Scanner(System.in);

           System.out.println("请输入年份:");
           int year = scanner.nextInt();

           System.out.println("请输入月份:");
           int month = scanner.nextInt();

           int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

           int totalDays = 0;

           for (int y = 1900; y < year; y++) {

               if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
                   totalDays += 366;
               } else {
                   totalDays += 365;
               }
           }

           boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

           for (int m = 0; m < month - 1; m++) {
               totalDays += daysInMonth[m];
           }

           if (isLeapYear && month > 2) {
               totalDays += 1;
           }

           System.out.println("从1900年1月1日到" + year + "年" + month + "月1日，共" + totalDays + "天。");
       }



}

