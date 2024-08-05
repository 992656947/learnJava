package com.HomeWork7_18_2;

public class UseCompute {
    Compute add = new add();
    Compute sub = new sub();
    Compute div = new div();
    Compute mul = new mul();
    public UseCompute() { }
    public void useCom(Compute com, int one, int two){
        System.out.println("结果是："+com.computer(one,two));
    }
}
