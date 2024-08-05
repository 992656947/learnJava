package chapter10.src.com.njwb.inter.ran;

import java.util.Random;

public class ranTest01 {
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        Random random = new Random(timestamp);
        int value = random.nextInt(10);
        System.out.println(value);



    }
}
