package io04;

import java.io.*;

public class FileInputAndOutput {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("chapter13\\src\\321.png");
            outputStream = new FileOutputStream("chapter13\\src\\321_copy.png");
            byte[] buffer = new byte[2048];

            int length = -1;
            long start = System.currentTimeMillis();
            while ((length=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,length);

            }
            long end = System.currentTimeMillis();
            System.out.println("用时"+(end-start));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(outputStream!=null){
                try {
                    outputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }

}
