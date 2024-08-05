package io3;

import java.io.*;

public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        Reader reader = null;
        BufferedReader bufferedReader = null;
        try{
            reader = new FileReader("C:\\123pan\\Downloads\\虚拟机\\虚拟机激活密钥.txt");
            bufferedReader = new BufferedReader(reader);
            char[] buffer = new char[30];
            int length = 0;
            int count = 0;
            long start = System.currentTimeMillis();
            while((length = reader.read(buffer))!=-1){
                System.out.println(new String(buffer,0,length));
                count++;

            }
            long end = System.currentTimeMillis();
            System.out.println("花费时间"+(end-start));
            System.out.println("触发"+count+"次");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(reader!=null){
                try {
                    reader.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }



    }
}
