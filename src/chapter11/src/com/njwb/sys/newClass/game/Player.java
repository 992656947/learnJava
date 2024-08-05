package chapter11.src.com.njwb.sys.newClass.game;

import java.util.Scanner;

public class Player {
    private int levelNo;

    private int currentScore;

    private long startTime;

    private long elapsedTime;

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    @Override
    public String toString() {
        return "当前玩家级别是："+this.levelNo+",当前得分是："+this.currentScore+",当前已用时间是："+this.elapsedTime;
    }

    //玩家玩游戏
    public void play(){
        Scanner input = new Scanner(System.in) ;

        Game game= new Game(this);
        //一共玩多少级别
        for(int i = 0 ;i<LevelParam.LEVELS.length;i++) {
            //初始玩家的级别号就是1级
            levelNo = levelNo+1;
            //计时
            this.startTime = System.currentTimeMillis();
            //当前积分清零
            this.currentScore=0;
            for(int j = 0 ; j<LevelParam.LEVELS[i].getStrTimes();j++) {
                String out = game.genString();
                System.out.println("系统输出："+out);
                System.out.print("用户输入：");
                String in = input.next() ;
                game.showResult(out,in);
            }
        }
    }



}
