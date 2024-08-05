package chapter11.src.com.njwb.sys.game;

public class Level {
    private int levelNo;
    private int score;
    private int strLength;
    private int strTime;
    private long elapsedTime;
    public Level(){};
    public Level(int levelNo, int score, int strLength, int strTime, long elapsedTime) {
        this.levelNo = levelNo;
        this.score = score;
        this.strLength = strLength;
        this.strTime = strTime;
        this.elapsedTime = elapsedTime;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStrLength() {
        return strLength;
    }

    public void setStrLength(int strLength) {
        this.strLength = strLength;
    }

    public int getStrTime() {
        return strTime;
    }

    public void setStrTime(int strTime) {
        this.strTime = strTime;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
