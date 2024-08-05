package chapter11.src.com.njwb.sys.game;

import java.util.Random;

public class Game {

    public String genString(){
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        int value = 5;
        for(int i =0;i<value;i++){
            int num = random.nextInt(value);
            switch (num){
                case 0:
                    stringBuffer.append("a");
                    break;
                case 1:
                    stringBuffer.append("b");
                    break;
                case 2:
                    stringBuffer.append("c");
                    break;
                case 3:
                    stringBuffer.append("d");
                    break;
                case 4:
                    stringBuffer.append("e");
                    break;
            }
        }
        String str = new String(stringBuffer);
        return str;
    }

    public void showResult(String out,String in){

    }

}
