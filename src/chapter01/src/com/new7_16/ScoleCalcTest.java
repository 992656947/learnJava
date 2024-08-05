package chapter01.src.com.new7_16;

public class ScoleCalcTest {
    public static void main(String[] args) {
        Student stu = new Student();
        ScoreCalc sc = new ScoreCalc();
        stu.htmlScore=90;
        stu.javaScore=70;
        stu.databaseScore = 80;
        int a = sc.getSum(stu);
        System.out.println(a);
        float b = sc.getAvg(stu);
        System.out.println(b);
    }
}
