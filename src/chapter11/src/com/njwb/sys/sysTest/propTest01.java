package chapter11.src.com.njwb.sys.sysTest;

import java.util.Enumeration;
import java.util.Properties;

public class propTest01 {
    public static void main(String[] args) {
        Properties properties =System.getProperties();
//        Properties properties = new Properties();
        Enumeration enums = properties.keys();
        while (enums.hasMoreElements()){
            String key = (String) enums.nextElement();
            System.out.println(properties.getProperty(key));
        }

    }
}
