package com.proxy;

public class Proxy  implements Subject{
    //代理真实角色
    private RealSubject realSubject ;
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }
    private void beforeGetMoney(){
        System.out.println("打探欠钱人的家庭背景....");
        System.out.println("24小时派个20岁的陪你一同睡觉，吃饭...");
        System.out.println("恐吓其家人.");
        System.out.println("..下面的动作过于暴力，无法描述。。。");
    }
    //丰富了真实不能干的事情
    @Override
    public void getMoney() {
        beforeGetMoney();
        //真正要求的还是真实角色
        realSubject.getMoney();
        after();
    }
    private void after(){
        System.out.println("收取佣金....");
    }
}
