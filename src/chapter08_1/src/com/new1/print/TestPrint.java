package chapter08_1.src.com.new1.print;

import com.new1.print.impl.A4Paper;
import com.new1.print.impl.A5Paper;
import com.new1.print.impl.BlankInc;

public class TestPrint {
    public static void main(String[] args) {
        Paper A4 = new A4Paper();
        Paper A5 = new A5Paper();
        Inc one = new BlankInc();
        Inc two = new BlankInc();
        Printer printer = new Printer(A4,one);
        printer.use();




    }
}
