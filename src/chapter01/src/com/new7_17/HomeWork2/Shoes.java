package chapter01.src.com.new7_17.HomeWork2;

public class Shoes extends Goods{
    public Shoes(double price, String name, int count) {
        super(price, name, count);
    }


    public double cost() {
        return Count*Price-(Count*(int)(Price))/200*20;
    }
}
