package filenameDemo;

import java.io.File;

public class FileDemo06 {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator+"123pan");
        ListFile(file);
    }

    public static void ListFile(File file){
        if(file!=null){
            if(file.isDirectory()){
                System.out.println(file.getName()+"目录");
                File[] fs = file.listFiles();
                for(File f : fs){
                    ListFile(f);
                }

            }else {
                System.out.println(file.getName()+"是文件");
            }
        }
    }

}
