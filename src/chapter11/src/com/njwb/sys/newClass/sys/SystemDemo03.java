package chapter11.src.com.njwb.sys.newClass.sys;


import java.util.Arrays;

public class SystemDemo03 {
    public static void main(String[] args) {

        int[] src = new int[]{1,3,5,7,9};
        int[] desc = new int[src.length+10];
        //覆盖
        System.arraycopy(src,0,desc,0,src.length);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(desc));


        //Arrays.




    }
}
