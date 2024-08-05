package chapter01.src.com.new7_16.pet2;

import java.util.Scanner;

public class PetTest {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎来到宠物店！");
        System.out.print("请输入领养宠物的名字：");
        pet1.setName(input.next());
        System.out.println("");

    }
}
