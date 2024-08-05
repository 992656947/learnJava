package chapter01.src.com.new7_17.HomeWork2;

public class Juice extends Goods {
    public Juice(double price, String name, int count) {
        super(price, name, count);
    }

    @Override
//    1~2瓶不打折,3~6瓶打九折,7~10瓶打八五折,11瓶以上打八折
    public double cost() {
        if (Count <= 2) {
            return Count * Price;
        } else if (Count <= 6) {
            return Count * Price * 0.9;
        } else if (Count <= 10) {
            return Count * Price * 0.85;
        } else {
            return Count * Price * 0.8;
        }
    }
}