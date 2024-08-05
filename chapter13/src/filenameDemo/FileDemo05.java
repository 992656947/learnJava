package filenameDemo;

import java.io.File;
import java.io.FileFilter;

public class FileDemo05 {
    public static void main(String[] args) {
        File file = new File("C:"+File.separator+"text");
        File fs[] = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return false;
            }
        });


    }
}
