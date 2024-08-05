package chapter01.src.com.new7_17.HomeWork2;

public class Cardigan extends Goods {
    public Cardigan(double price, String name, int count) {
        super(price, name, count);
    }
    public double cost(){
        return Count*Price*0.8;
    }
}
