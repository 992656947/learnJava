package chapter01.src.com.njwb;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class HomeWork7_12 {
    public static void main(String arg[]){
        //1
//                int[] a = {2, 4, 7, 8, 10, 15};
//                int count = 0;
//                int sum = 0;
//
//                for (int num : a) {
//                    if (num % 2 == 0) {
//                        count++;
//                        sum += num;
//                    }
//                }
//
//                double average = (count == 0) ? 0 : (double) sum / count;
//
//                System.out.println("偶数的个数: " + count);
//                System.out.println("偶数的平均值: " + average);

        //2
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("请输入一个单词:");
//                String word = scanner.nextLine();
//                scanner.close();
//
//                int vowelCount = 0;
//                int consonantCount = 0;
//
//                for (char c : word.toCharArray()) {
//                    if (isVowel(c)) {
//                        vowelCount++;
//                    } else if (Character.isLetter(c)) {
//                        consonantCount++;
//                    }
//                }
//
//                System.out.println("元音个数: " + vowelCount);
//                System.out.println("辅音个数: " + consonantCount);
//            }
//            private static boolean isVowel(char c) {
//                return "aeiouAEIOU".indexOf(c) != -1;

        //3
//                int[] sequence = {3, 4, 6, 7, 12, 9, 9, 5};
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("请输入一个数字:");
//                int guess = scanner.nextInt();
//                scanner.close();
//
//                boolean found = false;
//                for (int num : sequence) {
//                    if (num == guess) {
//                        found = true;
//                        break;
//                    }
//                }
//
//                if (found) {
//                    System.out.println("数列中包含此数");
//                } else {
//                    System.out.println("数列中不包含此数");
//                }

        //4


//
//                int[] lottery = new int[7];
//                Set<Integer> set = new HashSet<>();
//                Random random = new Random();
//
//                // 生成前六个数字
//                for (int i = 0; i < 6; i++) {
//                    int num;
//                    do {
//                        num = random.nextInt(33) + 1;
//                    } while (set.contains(num));
//                    set.add(num);
//                    lottery[i] = num;
//                }
//
//                // 生成最后一个数字
//                lottery[6] = random.nextInt(16) + 1;
//
//                System.out.println("生成的双色球彩票号码为: " + Arrays.toString(lottery));
//







    }
}
