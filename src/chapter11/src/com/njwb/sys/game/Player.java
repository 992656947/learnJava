package chapter11.src.com.njwb.sys.game;

public class Player {
    private int levelNo;
    private int currentScore;
    private  long startTime;
    private long elapsedTime;

    public Player(int levelNo, int currentScore, long startTime, long elapsedTime) {
        this.levelNo = levelNo;
        this.currentScore = currentScore;
        this.startTime = startTime;
        this.elapsedTime = elapsedTime;
    }

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
        return "Player{" +
                "当前玩家=" + levelNo +
                ", 当前得分=" + currentScore +
                ", 开始时间=" + startTime +
                ", 失去时间=" + elapsedTime +
                '}';
    }
}
