package chapter08.chapter08.src.com.njwb.inner;

public class OuterTest3 {

    public static void main(String[] args) {
        Outer3 outer3 = new Outer3() ;

        outer3.goInner(5);
    }

}


class Outer3{

    //外部类私有变量
    private String name = "李四";


    public void goInner(int num){
        class Inner{
            private String name = "wangwu";
            public void sayHello(){
                System.out.println(name);
                System.out.println("num:"+num);

            }
        }

        new Inner().sayHello();
    }
}
