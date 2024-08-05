package chapter11.src.com.njwb.sys.enumTest03;

public class Test {
    public static void main(String[] args) {
//        StudyClass c1 = StudyClass.ENG_BASE;
//        c1.meaning();
//        System.out.println(c1);
        StudyClass[] c = new StudyClass[]{StudyClass.ENG_BASE,StudyClass.ENG_MIDDLE,StudyClass.ENG_RAISE};
        for(StudyClass a :c){
            System.out.println(a.getClassName());
        }
    }
}
