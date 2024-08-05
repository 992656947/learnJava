package chapter12.src.com.njwb.list;

import java.util.Vector;

public class VectorDemo01 {
    public static void main(String[] args) {
        Vector vector = new Vector( );
        vector.addElement("aa");
        vector.addElement("bb");
        System.out.println(vector);
        vector.insertElementAt("cc",1);
        System.out.println(vector);
    }
}
