package chapter01.src.com.new7_16;

public class ScoreCalc {
    public int getSum(Student s){
        return s.databaseScore+s.javaScore+s.htmlScore;
    }
    public float getAvg(Student s){
        return getSum(s)/3;
    }
}
