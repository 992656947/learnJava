package file;

import java.io.File;

public class FileDemo06 {
    public static void main(String[] args) {
        File file = new File("d:"+ File.separator+"testhelloworld");
        ListFile(file);
    }




    public static void ListFile(File file) {
        if(file!=null) {
            if(file.isDirectory()) {
                System.out.println(file.getName()+"目录");
                File[] fs = file.listFiles();
                for(File f:fs) {
                    //递归操作
                    ListFile(f);
                }
            }else{
                //就是文件
                System.out.println(file.getName()+"是文件");

            }
        }
    }



}
