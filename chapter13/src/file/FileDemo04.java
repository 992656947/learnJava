package file;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {

        //构建一个文件
        File file = new File("D:\\我的软件");

        if(file.isDirectory()) {
            System.out.println("该文件是一个目录");
            //列出该目录的子文件
            //String[] subnames = file.list();
            File[] files  = file.listFiles();
            for(File f:files) {
                System.out.println(f);
            }
        }

    }
}
