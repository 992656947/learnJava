package io1;

import java.io.*;

public class FileInputStreamDemo02 {
    public static void main(String[] args) {
        //构建文件
        File file = new File("C:\\123pan\\Downloads\\虚拟机\\虚拟机激活密钥.txt");
        InputStream inputStream = null ;
        try {
            //创建流
            inputStream = new FileInputStream(file);

            byte[] buffer = new byte[4];

            //操作流
            int length = 0;
            int count = 0;
            while((length=inputStream.read(buffer))!=-1) {
               String str = new String(buffer,0,length);
               System.out.print(str);
               count++;
            }
            System.out.println("触发"+count +"次");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流
            if(inputStream!=null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
