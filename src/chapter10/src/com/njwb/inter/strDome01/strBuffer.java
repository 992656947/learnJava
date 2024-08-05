package chapter10.src.com.njwb.inter.strDome01;

public class strBuffer {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("hello");
//        for(int i = 0;i<50;i++){
//            str.append(i);
//            System.out.println(str.hashCode());
//        }

        str.append(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(str.toString());
        System.out.println(str.reverse());
    }
}
