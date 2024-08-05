package chapter01.src.com.new7_15.CellAndPhone;

public class Cell {
    public String brand;
    public  int power;
    public void getPower(){
        System.out.println("正在充电中！");
    }
    public void info(){
        System.out.println(brand+"电量是："+power);
    }

}
