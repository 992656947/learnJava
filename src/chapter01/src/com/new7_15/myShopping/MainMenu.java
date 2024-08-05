package chapter01.src.com.new7_15.myShopping;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        while (true) {
            System.out.println("****************");
            System.out.println("欢迎使用购物系统");
            System.out.println("****************");
            System.out.println("1.用户登录");
            System.out.println("2.退出");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("请输入用户名：");
                String username = input.next();
                System.out.println("请输入密  码：");
                String password = input.next();
                LoginMenu Login = new LoginMenu();
                Login.GetLoginMenu(username, password);
            } else {
                System.exit(0);
            }
        }
    }
}
