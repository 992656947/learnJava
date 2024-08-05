package chapter10.src.com.njwb.inter.TestDemo01;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        Random random = new Random(time);
        int[] red =  new int[6];
        for (int i= 0;i< red.length;i++){
            red[i] = random.nextInt(33)+1;
        }
        int blue = random.nextInt(16)+1;
        boolean is_win = false;
        for(int i =0; i<red.length;i++){
            if (red[i] == blue){
                is_win = true;
                break;
            }
        }
        if (is_win){
            System.out.println("中奖！");
        }else {
            System.out.println("再接再厉!");
        }


    }
}
