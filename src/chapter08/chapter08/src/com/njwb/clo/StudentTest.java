package chapter08.chapter08.src.com.njwb.clo;

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s = new Student("张三",15);
        System.out.println("s:"+s);

        Student newStudent = (Student)s.clone();

        System.out.println("newStudent:"+newStudent);
    }
}
