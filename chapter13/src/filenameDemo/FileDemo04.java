package filenameDemo;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("C:\\123pan");
        if(file.isDirectory()){
            System.out.println("该文件是一个目录");
            String[] subnames = file.list();
            for(String sub: subnames){
                System.out.println(sub);
            }
        }
    }
}
