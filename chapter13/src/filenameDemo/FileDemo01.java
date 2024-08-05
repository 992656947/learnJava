package filenameDemo;
import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("chapter13"+File.separator+"src"+File.separator+"a.txt");

        System.out.println(file.getParent());
        System.out.println(file.getParentFile().getParentFile());

        file.renameTo(new File("chapter13"+File.separator+"src"+File.separator+"bcd.txt"));

    }
}
