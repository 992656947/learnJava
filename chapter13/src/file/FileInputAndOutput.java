package file;

import java.io.*;

public class FileInputAndOutput {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("chapter13\\src\\321.png");
            outputStream = new FileOutputStream("chapter13\\src\\321_copy.png");
            byte[] buffer = new byte[10];

            int length = -1;

            while ((length=inputStream.read(buffer))!=-1){
                outputStream.write(buffer,0,length);

            }
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
