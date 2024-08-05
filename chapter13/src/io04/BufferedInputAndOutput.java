package io04;

import java.io.*;

public class BufferedInputAndOutput {
    public static void main(String[] args) {
        InputStream inputStream = null;
        BufferedInputStream bis = null;
        OutputStream outputStream = null;
        BufferedOutputStream bos =null;

        try {
            inputStream = new FileInputStream("chapter13\\src\\321.png");
            bis = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream("chapter13\\src\\321_copy2.png");
            bos = new BufferedOutputStream(outputStream);
            byte[] buffer = new byte[2048];

            int length = -1;

            long start = System.currentTimeMillis();
            while ((length=inputStream.read(buffer))!=-1){
                bos.write(buffer,0,length);
                bos.flush();

            }
            long end = System.currentTimeMillis();
            System.out.println("用时"+(end-start));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

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
