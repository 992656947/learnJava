package com.mr;

public class MethodReferenceDemo01 {
    public static void main(String[] args) {
        usePrintable(new Printable() {
            @Override
            public void printString(String s) {
                System.out.println(s);
            }
        }, "匿名内置函数");

        usePrintable(s -> System.out.println(s), "Lambda");

        usePrintable(System.out::println, "Method");
    }

    public static void usePrintable(Printable printable, String msg) {
        printable.printString(msg);
    }
}

interface Printable {
    void printString(String s);
}
