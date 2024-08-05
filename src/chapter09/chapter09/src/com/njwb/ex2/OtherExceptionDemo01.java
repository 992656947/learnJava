package chapter09.chapter09.src.com.njwb.ex2;

import java.util.Scanner;

public class OtherExceptionDemo01 {
    public static void main(String[] args) {


        try {
            Class.forName("adf");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




    }
}
