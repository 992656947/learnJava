package chapter11.src.com.njwb.sys.newClass.enu;

public class StudentTest {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("zhagnsan");

        student.setSex(Gender.MALE);
        System.out.println(student);
    }
}
