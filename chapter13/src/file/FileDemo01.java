package file;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        //构建一个文件对象
        File file = new File("d:"+File.separator+"a.txt");


        System.out.println("该文件存在吗？"+file.exists());
        System.out.println("该文件可读吗？"+file.canRead());
        System.out.println("该文件可写吗？"+file.canWrite());
        System.out.println("该文件可执行吗？"+file.canExecute());

        System.out.println("该文件是文件吗?"+file.isFile());
        System.out.println("该文件是目录吗？"+file.isDirectory());

        //返回的是文件名+后缀名
        System.out.println("该文件的文件名是："+file.getName());
        //返回文件大小，单位字节
        System.out.println("该文件的大小是："+file.length());

        //D:\idea_project\java_project\chapter13\src\a.txt
        System.out.println("该文件的绝对路径："+file.getAbsolutePath());
        System.out.println("该文件相对路径："+file.getPath());



    }
}
