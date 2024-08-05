package chapter09.chapter09.src.com.njwb.ex2;


public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person() ;
        try {
            person.setName("张三");
            person.setAge(2);
        }catch (AgeErrException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println(person);
        }

        System.out.println("程序结束");


    }
}
