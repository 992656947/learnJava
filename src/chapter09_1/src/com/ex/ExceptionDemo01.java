package chapter09_1.src.com.ex;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        String message = say();
        System.out.println("message:"+message);
    }



    public static String say(){
        String str = "hello";
        try{
            str = null ;
            str.equals("Helloworld");
        }catch(Exception e) {
            System.out.println("进入了异常");
            return "我是异常";
        }finally {
            System.out.println("执行了finally");
        }
        return "helloWorld";
    }
}
