package chapter12.src.com.njwb.list;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo03 {

    public static void main(String[] args) {

        //创建了一个集合
        List list = new Vector();

        list.add("aa");
        list.add("bb");
        list.add("cc");

        list.add("灌篮高手");
        list.add("圣斗士星矢");
        list.add("灌篮高手");


        System.out.println(list);
        ListIterator listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()) {
            Object value = listIterator.previous();
            System.out.println(value);
        }

        System.out.println("------------------------------");
        //从前向输出
        ListIterator listIterator2 = list.listIterator();
        while(listIterator.hasNext()) {
            Object value = listIterator.next();
            System.out.println(value);
        }
    }
}
