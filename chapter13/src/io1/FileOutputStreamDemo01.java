package io1;

import java.io.*;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) {

        OutputStream outputStream =null ;


        try {
            outputStream = new FileOutputStream(new File("chapter13/src/hahaha.txt"));


//            outputStream.write(97);
//            outputStream.write(98);
//            outputStream.write(99);
//            outputStream.write(100);
//            outputStream.write(101);
//            outputStream.write(102);


            outputStream.write("helloworld".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStream!=null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
