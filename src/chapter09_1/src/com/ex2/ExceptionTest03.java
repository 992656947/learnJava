package chapter09_1.src.com.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest03 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            selectCourse();
        } catch (CourseNameErrException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch(InputMismatchException e) {
            System.out.println("输入的必须是数字");
        }finally{
            System.out.println("欢迎提出建议 。。。。");
        }
    }


    public static void selectCourse() throws CourseNameErrException {
        System.out.println("请输入一个代号(1-3之间的数字):");
        int no = scanner.nextInt();
        if(no==1) {
            System.out.println("sshap编程");
        }else if(no==2) {
            System.out.println("java编程");
        }else if(no==3) {
            System.out.println("python编程");
        }else{
            throw new CourseNameErrException("课程号错误,必须是1-3之间的错误");
        }
    }
}
