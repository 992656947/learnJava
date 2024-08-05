package io1;

import java.io.*;

public class FileInputStreamDemo01 {
    public static void main(String[] args) {
        //构建文件
        File file = new File("C:"+File.separator+"hello.txt");
        InputStream inputStream = null ;
        try {
            //创建流
            inputStream = new FileInputStream(file);
            //操作流
            int length = 0;
            while((length=inputStream.read())!=-1) {
               char c = (char) length;
               System.out.print(c);
            }
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
