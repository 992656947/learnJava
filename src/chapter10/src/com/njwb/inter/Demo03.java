package chapter10.src.com.njwb.inter;

import java.math.BigDecimal;

public class Demo03 {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 9.9;

        double num3 = num1-num2;
        System.out.println(num3);

        BigDecimal bigDecimal1 = new BigDecimal("10");
        BigDecimal bigDecimal2 = new BigDecimal("9.9");
        BigDecimal res = bigDecimal1.subtract(bigDecimal2);
        System.out.println(res);

        System.out.println("------------------------------------");
        System.out.println(Math.max(2,3));
        System.out.println(Math.min(2,3));
        System.out.println(Math.abs(-4));
        System.out.println(Math.ceil(5.6));
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.random()*10);
        System.out.println(Math.floor(-6.5));
        System.out.println(Math.floor(5.4));


    }
}
