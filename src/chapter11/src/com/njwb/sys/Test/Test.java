package chapter11.src.com.njwb.sys.Test;

import com.njwb.sys.enumTest02.Payment;

public class Test {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        System.out.println(p1.toString());

        Payment p2 = Payment.WEI_XIN;
        System.out.println(p2);

    }
}
