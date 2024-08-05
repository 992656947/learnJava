package file;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileDemo05 {
    public static void main(String[] args) {

        //构建一个文件
        File file = new File("D:"+File.separator+"testhelloworld");


        File fs[]  =file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {

                return pathname.getName().endsWith("txt");
            }
        });

        for (File f:fs) {
            System.out.println(f);
        }





    }
}

