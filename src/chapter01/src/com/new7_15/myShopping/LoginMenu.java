package chapter01.src.com.new7_15.myShopping;

public class LoginMenu {
    public String username = "admin";
    public String password = "123456";
    public void GetLoginMenu(String username1,String password1){
        if(username.equals(username1) && password.equals(password1)){
            System.out.println("登录成功！");

        }else{
            System.out.println("用户名或者密码错误！");
        }
    }
}
