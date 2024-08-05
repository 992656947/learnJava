package chapter08.chapter08.src.com.njwb.print;

import com.njwb.print.impl.A4Paper;
import com.njwb.print.impl.BlankInc;
import com.njwb.print.impl.ColorInc;

public class Printer {


    public void print(Inc inc, Paper paper, String content) {
        System.out.println("正在使用"+inc.getColor()+"在"+paper.getSize()+"上打印"+content);
    }

}
