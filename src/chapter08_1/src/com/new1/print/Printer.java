package chapter08_1.src.com.new1.print;

import com.new1.door.Lock;
import com.new1.print.impl.A4Paper;
import com.new1.print.impl.A5Paper;
import com.new1.print.impl.BlankInc;

public class Printer {
    private Paper paper;
    private Inc inc;

    public Printer(Paper paper, Inc inc) {
        this.paper = paper;
        this.inc = inc;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public Inc getInc() {
        return inc;
    }

    public void setInc(Inc inc) {
        this.inc = inc;
    }

    public void use(){
        System.out.println("使用"+inc.getInc()+"和"+paper.getPaper()+"进行打印。。。");
    }
}
