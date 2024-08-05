package chapter12.src.com.njwb.entity;

public class Pointer2 {
    private String x ;

    private String y ;


    public Pointer2(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
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
