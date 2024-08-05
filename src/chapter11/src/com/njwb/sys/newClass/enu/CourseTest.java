package chapter11.src.com.njwb.sys.newClass.enu;

import java.util.Scanner;

public class CourseTest {
    public static void main(String[] args) {
//        Course course = null;
//        Scanner input= new Scanner(System.in);
//
//        try{
//            System.out.println("请输入你的新东方班级[U1,U2,U3]:");
//            String name = input.next();
//            course = Enum.valueOf(Course.class,name);
//
//            switch (course) {
//                case U1:
//                    System.out.println("请到张老师哪里报道...");
//                    break;
//                case U2:
//                    System.out.println("请到李老师哪里报道！！！");
//                    break;
//                case U3:
//                    System.out.println("请到王老师哪里报道！！！");
//                    break;
//            }
//            course.target();
//        }catch(Exception e) {
//
//        }finally {
//            System.out.println("欢迎提出意见。。。");
//        }

        Course[] courses  = new Course[] {Course.U1,Course.U2,Course.U3};



        for(int i = 0 ;i< courses.length;i++) {

            System.out.println(courses[i].name()+"-->"+courses[i].ordinal());

        }




    }
}
