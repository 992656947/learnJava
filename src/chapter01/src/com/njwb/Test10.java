package chapter01.src.com.njwb;

public class Test10 {
    public static void main(String arg[]){
        int[][] dates = new int[3][2];
        dates[0][0]=90;
        dates[0][1] = 88;

        dates[1][0] = 100;
        dates[1][1] =200;

        dates[2][0] = 300;
        dates[2][1] = 345;

        for (int[] row : dates) {
            for (int value : row) {
            System.out.println(value);
        }

    } }}

