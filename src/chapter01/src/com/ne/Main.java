package chapter01.src.com.ne;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------客户信息管理系统--------------");
        System.out.println("\t\t\t\t   1、添加客户");
        System.out.println("\t\t\t\t   2、删除客户");
        System.out.println("\t\t\t\t   3、修改客户");
        System.out.println("\t\t\t\t   4、查询客户");
        System.out.println("\t\t\t\t   5、退出");
        System.out.println("-------------------------------------------");

        List<Customer> customers = new ArrayList<>();
        int newID = 0;

        CustomerServer cs = new CustomerServer(newID, customers);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            int opt = scanner.nextInt();
            switch (opt) {
                case 1:
                    cs.addCustomer();
                    break;
                case 2:
                    cs.deleteCustomer();
                    break;
                case 3:
                    cs.changeCustomer();
                    break;
                case 4:
                    cs.checkCustomer();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("请输入正确的数字");
                    break;
            }
        }
    }
}
