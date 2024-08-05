package chapter09_1.src.com.ex2;

import java.util.concurrent.TimeoutException;

public class ThrDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        int result = devide(10,2);
        System.out.println(result);
    }

    public  static int devide(int a,int b) throws ClassNotFoundException {
        if(b==0) {
            throw new ArithmeticException();
        }
        Class.forName("com.njwb.ex2.ThrDemo01");
        return a/b;
    }



}


//class Parent{
//    public void say() throws ClassNotFoundException {
//        System.out.println("父亲说。。。");
//    }
//}
//
//class Son extends  Parent{
//
//    public void say() throws ClassNotFoundException, TimeoutException {
//        System.out.println("儿子说。。。");
//    }
//}
