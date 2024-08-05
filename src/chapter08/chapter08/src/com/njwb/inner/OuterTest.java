package chapter08.chapter08.src.com.njwb.inner;

public class OuterTest {

    public static void main(String[] args) {
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.sayHello("helloworld");
    }

}



class Outer{

    //外部类私有变量
    private String name = "李四";

    class Inner {
        //内部类私有属性
        private String name = "张三";
        //在内部类中可以访问到外部的私有变量
        public void sayHello(String name){
            System.out.println("name:"+name);
            System.out.println("内部类的属性:"+this.name);
            System.out.println("外部类的属性："+Outer.this.name);
        }
    }

}
