package chapter08.chapter08.src.com.njwb.print;

import com.njwb.print.impl.A4Paper;
import com.njwb.print.impl.B5Paper;
import com.njwb.print.impl.BlankInc;
import com.njwb.print.impl.ColorInc;

public class PrintTest {
    public static void main(String[] args) {

        //创建打印机
        Printer printer =new Printer() ;

        //构建墨盒和纸张
        Inc inc = new BlankInc();
        Paper paper = new A4Paper();

        //打印数据
        printer.print(inc,paper,"HelloWorld");



        //换墨盒
        inc = new ColorInc();
        printer.print(inc,paper,"HelloWorld");

        paper = new B5Paper();
        printer.print(inc,paper,"HelloWorld");


        inc = new BlankInc();
        printer.print(inc,paper,"HelloWorld");

    }
}
