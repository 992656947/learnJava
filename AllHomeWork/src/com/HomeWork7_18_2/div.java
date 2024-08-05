package com.HomeWork7_18_2;

public class div implements Compute {
    @Override
    public int computer(int n, int m) {
        if (m!=0){
            return n/m;
        }else {
            System.out.println("被除数不能为0");
            return -1;
        }
    }
}
