package chapter12.src.com.njwb.entity;

public class PointTest {
    public static void main(String[] args) {
//        Pointer2 pointer = new Pointer2("北纬30°","东经50°" );
//        System.out.println(pointer);


        Pointer<Integer,Integer> pointer = new Pointer<>(4,10);
        System.out.println(pointer);

        Pointer<String,String> pointer2 = new Pointer<>("北纬30°","东经50°");
        System.out.println(pointer2);



    }
}
