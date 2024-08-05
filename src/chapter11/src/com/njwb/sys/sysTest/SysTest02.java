package chapter11.src.com.njwb.sys.sysTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SysTest02 {
    public static void main(String[] args) {
        int[] src = new int[]{1,3,5,7,9};
        int[] desc = new int[]{2,4,6,8,10,12,14};
        System.arraycopy(src,2,desc,5,3);
        System.out.println(Arrays.toString(src));
        System.out.println(Arrays.toString(desc));
    }
}
