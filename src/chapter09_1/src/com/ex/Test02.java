package chapter09_1.src.com.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));

//            String str = null ;
//            str.equals("Helloworld");
            int[] array = new int[1];
            System.out.println(array[1]);
        }catch(InputMismatchException e) {
            //e.printStackTrace();
            System.err.println(e.getMessage());
        }catch(ArithmeticException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }catch(NullPointerException e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getMessage());
        }

        System.out.println("感谢使用本程序！");

    }
}
