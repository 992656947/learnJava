package chapter12.src.com.njwb.entity;

public class Pointer1 {
    private int x ;

    private int y ;


    public Pointer1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pointer1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
