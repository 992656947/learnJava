package chapter11.src.com.njwb.sys.newClass.game;

public class Level {
    //级别号
    private int levelNo;
    //该级别的得分
    private int score;
    //该级别输出字符串的长度
    private int strLength;
    //该级别输出字符串次数
    private int strTimes;
    //该级别的最大时间
    private long elapsedTime;

    private Level(){}

    public Level(int levelNo, int score, int strLength, int strTimes, long elapsedTime) {
        this.levelNo = levelNo;
        this.score = score;
        this.strLength = strLength;
        this.strTimes = strTimes;
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

    public int getStrTimes() {
        return strTimes;
    }

    public void setStrTimes(int strTimes) {
        this.strTimes = strTimes;
    }

    public long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
