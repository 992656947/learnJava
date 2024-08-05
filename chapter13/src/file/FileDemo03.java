package file;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        //构建一个文件对象
        File file = new File("d:"+ File.separator+"test"+File.separator+
                "abc"+File.separator+
                "hello"+File.separator+
                "world"+File.separator+
                "helloworld");

        //在window中不存在。


        //构建一个目录
        //file.mkdir();

        //构建多级目录
        file.mkdirs();

        System.out.println("该文件是目录吗？"+file.isDirectory());
    }
}
