package chapter11.src.com.njwb.sys.newClass.game;

import java.util.Random;

public class Game {
    private Player player ;



    public Game(Player player) {
        this.player = player;
    }

    /**
     * 系统生成字符串
     * @return 返回字符串会变化，每个级别输出字符串会逐渐递增
     */
    public String genString(){
        StringBuffer stringBuffer = new StringBuffer();
        Random random  = new Random();
        //当前级别，字符串的长度
        int strLength = LevelParam.LEVELS[this.player.getLevelNo()-1].getStrLength();
        int value = strLength;
        for(int i = 0 ; i<value;i++) {
            int num = random.nextInt(value);
            switch (num) {
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
                case 5:
                    stringBuffer.append("e");
                    break;
                case 6:
                    stringBuffer.append("f");
                    break;
                case 7:
                    stringBuffer.append("g");
                    break;
            }
        }
        String str = new String(stringBuffer);
        return  str ;
    }


    //比较结果
    public void showResult(String out,String in) {
        if(!out.equals(in)) {
            System.out.println("输入错误，系统退出！！！");
            System.exit(-1);
        }else{
            //输入正确
            long endTime = System.currentTimeMillis();
            //已用时间
            long elapsedTime = (endTime-this.player.getStartTime())/1000;
            this.player.setElapsedTime(elapsedTime);

            //累加得分
            this.player.setCurrentScore(this.player.getCurrentScore()+LevelParam.LEVELS[this.player.getLevelNo()-1].getScore());
            if(elapsedTime<=LevelParam.LEVELS[this.player.getLevelNo()-1].getElapsedTime()) {
                //未超时
                //显示当前玩家的基本信息
                System.out.println(this.player.toString());
                //通关判断
                //到达最高级别了
                if(this.player.getLevelNo()==LevelParam.LEVELS.length) {
                    if(this.player.getCurrentScore() == LevelParam.LEVELS[LevelParam.LEVELS.length-1].getScore()*LevelParam.LEVELS[LevelParam.LEVELS.length-1].getStrTimes()) {
                        System.out.println("恭喜你，手速快的一笔！！！，游戏结束");
                    }
                }

            }else{
                System.out.println("输入超时，系统退出！！！");
                System.exit(-1);
            }

        }

    }

}
