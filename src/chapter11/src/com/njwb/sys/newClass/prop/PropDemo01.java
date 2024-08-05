package chapter11.src.com.njwb.sys.newClass.prop;

import java.util.Enumeration;
import java.util.Properties;

public class PropDemo01 {
    public static void main(String[] args) {

        //创建一个属性对象
        Properties properties = new Properties();
        System.out.println(properties);
        //向属性对象中添加属性
        properties.setProperty("ComSpec","%SystemRoot%\\system32\\cmd.exe");
        properties.setProperty("JAVA_HOME","C:\\Program Files\\Java\\jdk1.8.0_181");
        properties.setProperty("PATH","%JAVA_HOME%\\bin");
        System.out.println(properties);
        //输出
        Enumeration enums = properties.keys();
        while(enums.hasMoreElements()) {
            //取出元素
            String key = (String) enums.nextElement();
            //根据key来获取对应的值
            System.out.println(key+"--->"+properties.getProperty(key));
        }
    }
}
