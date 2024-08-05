package chapter11.src.com.njwb.sys.newClass.sys;

public class SystemDemo04 {
    public static void main(String[] args) {
        //person可是名花有主的
        Person person = new Person();

        //new Person()-->垃圾
        person = null ;


        //调用垃圾收集器（由java虚拟机进行调度）
        //System.gc ==  Runtime.getRuntime().gc();

        Runtime.getRuntime().gc();
    }
}
