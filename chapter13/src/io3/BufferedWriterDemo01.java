package io3;

import java.io.*;

public class BufferedWriterDemo01 {
    public static void main(String[] args) {
        Writer writer = null;
        BufferedWriter bufferedWriter = null;
        try {
            writer = new FileWriter("chapter13/bw.txt");
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("你好");
            bufferedWriter.newLine();
            bufferedWriter.write("你好");
            bufferedWriter.newLine();
            bufferedWriter.write("你好");

            bufferedWriter.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
