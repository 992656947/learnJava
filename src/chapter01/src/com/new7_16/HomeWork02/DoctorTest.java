package chapter01.src.com.new7_16.HomeWork02;

public class DoctorTest {
    public static void main(String[] args) {
        Specialist doctor1 = new Specialist("张三","1001","南京","骨科");
        NonSpecialist doctor2 = new NonSpecialist("李四","1002","南京");
        doctor1.introduce();
        doctor2.introduce();
    }
}
