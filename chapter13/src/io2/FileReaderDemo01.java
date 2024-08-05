package io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderDemo01 {
    public static void main(String[] args) {
        Reader reader = null;
        try{
            reader = new FileReader("C:\\123pan\\Downloads\\虚拟机\\虚拟机激活密钥.txt");
            char[] buffer = new char[10];
            int length = 0;
            int count =0;
//            while ((length = reader.read())!=-1){
//                char c = (char)length;
            while ((length = reader.read(buffer))!=-1){
                String msg = new String(buffer,0,length);
//                System.out.println(c);
                System.out.println(msg);
                count++;

            }
            System.out.println("触发"+count+"次");


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
