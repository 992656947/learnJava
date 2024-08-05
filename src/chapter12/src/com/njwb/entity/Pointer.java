package chapter12.src.com.njwb.entity;

public class Pointer<T,K> {
    private T x ;

    private K y ;


    public Pointer(T x, K y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public K getY() {
        return y;
    }

    public void setY(K y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pointer{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }


}
