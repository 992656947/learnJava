package chapter08_1.src.com.new1;

public class InterDemo01 {
    public static void main(String[] args) {
        System.out.println(Interface01.i);
    }
}
interface Interface01{
    public static final int i =10;
    public abstract void say();
}

interface Interface02{
    void hello();
}

interface Interface03 extends Interface01,Interface02{
    void aa();
}

class B{}

class A extends B implements Interface02,Interface01{
    public void say(){ }

    public void hello(){ }

}


