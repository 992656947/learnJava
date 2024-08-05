package chapter11.src.com.njwb.sys.newClass.sys;

import java.util.Enumeration;
import java.util.Properties;

public class SystemDemo01 {
    public static void main(String[] args) {
        //获取当前时间距离1970年1-1之间的毫秒数
        //System.out.println(System.currentTimeMillis());
        //获取系统属性
        Properties properties = System.getProperties();
        //获取所有的key和value

        Enumeration enums = properties.keys();
        while(enums.hasMoreElements()) {
            //取出元素
            String key = (String) enums.nextElement();
            //根据key来获取对应的值
            System.out.println(key+"--->"+System.getProperty(key));
        }

    }
}
