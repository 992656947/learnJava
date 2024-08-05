package chapter01.src.com.new7_17.HomeWork2;

public abstract class Goods {
    protected double Price;
    protected String Name;
    protected int Count;

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public Goods(double price, String name, int count) {
        Price = price;
        this.Name = Name;
        Count = count;
    }

    public abstract double cost();

}
