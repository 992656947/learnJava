package chapter08.chapter08.src.com.njwb.inner;

//static可以修饰->变量、方法，代码块。


public  class OuterTest2 {

    public static void main(String[] args) {
        //创建静态内部的方式
        Outer2.Inner inner = new Outer2.Inner();


        inner.sayHello();
    }

}


class Outer2{

    private static String name="lisi";

    static class Inner{
        private String name = "wangwu";

        public void sayHello(){
            System.out.println(this.name);
            System.out.println(Outer2.name);
        }
    }


}
