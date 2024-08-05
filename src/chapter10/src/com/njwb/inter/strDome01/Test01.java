package chapter10.src.com.njwb.inter.strDome01;

public class Test01 {
    public static void main(String[] args) {
        char[] buffer = new char[]{'h','e','l','l','o'};
        String str1 = new String(buffer);
        System.out.println(str1) ;
        String str2 = new String(buffer,1,3);
        System.out.println(str2);
        System.out.println("------------------------");

        byte[] a = new byte[]{97,98,99,100};
        String b = new String(a);
        System.out.println(b);

    }
}
