package file;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) {
        //路径分割符
        System.out.println(File.separator);
        //path路径分隔符
        System.out.println(File.pathSeparator);

        File file = new File("chapter13"+File.separator+"src"+File.separator+"helloworld.txt");
        if(!file.exists()) {
            //不存在在创建
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            //存在就删除掉
            file.delete();
        }

    }
}
