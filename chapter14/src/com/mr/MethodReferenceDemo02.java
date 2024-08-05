package com.mr;

public class MethodReferenceDemo02 {
    public static void main(String[] args) {
        useConverter(new Converter() {
            @Override
            public int conver(String s) {
                return Integer.parseInt(s);
            }
        },"15");


        useConverter(s->Integer.parseInt(s),"17");

        useConverter(Integer::parseInt,"18");


    }


    public static void useConverter(Converter converter, String s) {
        int value = converter.conver(s);
        System.out.println("字符串:"+s+"\t转换后:"+value);
    }
}

interface Converter {
    public int conver(String s);
}
