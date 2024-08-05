package chapter10.src.com.njwb.inter.strDome01;

public class Test02 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str3.substring(2));
        System.out.println(str3.substring(2,7));
        byte[] str4 = str3.getBytes();
        for(byte a:str4){
            System.out.println((char)a);
        }

        System.out.println(str3.indexOf("lo"));
        System.out.println(str3.lastIndexOf("l"));

    }
}
