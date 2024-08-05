package chapter01.src.com.new7_17.HomeWork2;

public class ShopTest {
    public static void main(String[] args) {
        Goods cardigan = new Cardigan(350.0,"羊毛衫",2);
        Goods shoes = new Shoes(212.0,"鞋子",1);
        Goods juice = new Juice(3.5,"果汁1号",9);
        System.out.println("羊毛衫"+cardigan.cost()+"元");
        System.out.println("鞋子"+shoes.cost()+"元");
        System.out.println("果汁1号"+juice.cost()+"元");
        double sum =0;
        sum = cardigan.cost()+shoes.cost()+juice.cost();
        System.out.println("共消费"+sum+"元");
    }
}
