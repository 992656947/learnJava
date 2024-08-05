package com.mr;

public class MethodReferenceDemo03 {
    public static void main(String[] args) {
        // 使用Lambda表达式
        usePrinter(s -> System.out.println(s.toUpperCase()), "helloworld");

        // 使用方法引用
        PrintString printString = new PrintString();
        usePrinter(printString::printUpperCase, "helloworld");
    }

    public static void usePrinter(Printer printer, String s) {
        printer.printUpperCase(s);
    }
}

interface Printer {
    void printUpperCase(String s);
}

class PrintString {
    public void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}















