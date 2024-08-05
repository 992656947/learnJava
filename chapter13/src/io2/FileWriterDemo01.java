package io2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterDemo01 {
    public static void main(String[] args) {
        Writer writer = null;

        try {
            writer = new FileWriter("chapter13/src/filewrite.txt");
            writer.write(new char[]{'中','国'});
            writer.write("\r\n");
            writer.write("永劫无间");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(writer!=null){
                try {
                    writer.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
