package chapter08.chapter08.src.com.njwb.inter;

public class InterDemo01 {

    public static void main(String[] args) {





    }
}



interface Interface01{
   int i=10 ;

   public abstract  void say();

}


//接口可以实现多继承


interface  Interface02{
    void hello();
}

interface  Interface03 extends Interface01,Interface02{

}

class B{

}

class A extends B implements Interface01,Interface02{
    public void say(){

    }
    public void hello(){

    }
}
