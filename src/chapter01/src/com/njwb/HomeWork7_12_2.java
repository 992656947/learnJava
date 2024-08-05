package chapter01.src.com.njwb;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork7_12_2 {
    private static long[] num = {8844556699100L};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. 查找数字");
            System.out.println("2. 添加数字");
            System.out.println("3. 删除数字");
            System.out.println("4. 修改数字");
            System.out.println("5. 列出所有数组中的数据");
            System.out.println("0. 退出");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    findNumber(scanner);
                    break;
                case 2:
                    addNumber(scanner);
                    break;
                case 3:
                    deleteNumber(scanner);
                    break;
                case 4:
                    modifyNumber(scanner);
                    break;
                case 5:
                    listNumbers();
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("无效的选择，请重试。");
            }
        }
    }

    private static void findNumber(Scanner scanner) {
        System.out.println("请输入要查找的数字:");
        long target = scanner.nextLong();
        int index = Arrays.binarySearch(num, target);
        if (index >= 0) {
            System.out.println("找到数字，位置为: " + index);
        } else {
            System.out.println("数组中没有找到该数字。");
        }
    }

    private static void addNumber(Scanner scanner) {
        System.out.println("请输入要添加的数字:");
        long newNumber = scanner.nextLong();
        num = Arrays.copyOf(num, num.length + 1);
        num[num.length - 1] = newNumber;
        Arrays.sort(num);
        System.out.println("数字添加成功。");
    }

    private static void deleteNumber(Scanner scanner) {
        System.out.println("请输入要删除的数字:");
        long target = scanner.nextLong();
        int index = Arrays.binarySearch(num, target);
        if (index >= 0) {
            long[] newNum = new long[num.length - 1];
            for (int i = 0, j = 0; i < num.length; i++) {
                if (i != index) {
                    newNum[j++] = num[i];
                }
            }
            num = newNum;
            System.out.println("数字删除成功。");
        } else {
            System.out.println("数组中没有找到该数字。");
        }
    }

    private static void modifyNumber(Scanner scanner) {
        System.out.println("请输入要修改的数字:");
        long target = scanner.nextLong();
        int index = Arrays.binarySearch(num, target);
        if (index >= 0) {
            System.out.println("请输入新的数字:");
            long newNumber = scanner.nextLong();
            num[index] = newNumber;
            Arrays.sort(num);
            System.out.println("数字修改成功。");
        } else {
            System.out.println("数组中没有找到该数字。");
        }
    }

    private static void listNumbers() {
        System.out.println("数组中的数字为:");
        for (long n : num) {
            System.out.println(n);
        }
    }
}
