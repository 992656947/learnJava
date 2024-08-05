package chapter09_1.src.com.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
    static Logger logger = Logger.getLogger("com.njwb.ex.Test03");
    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
            Person person = new Person();
            person.setName("张三");
            person.setAge(12);
            int[] array = new int[1];
            System.out.println(array[1]);
        }catch(InputMismatchException e) {
            logger.debug("输入的数字必须是整数");
        }catch(ArithmeticException e) {
            logger.debug("除数不能为0");
            logger.info("除数不能为0");
        } catch (AgeErrException e) {
            logger.debug(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e) {
            logger.debug("数组的索引越界了");
        } finally{
            System.out.println("感谢使用本程序！");
        }

        System.out.println("程序结束了");


    }
}
