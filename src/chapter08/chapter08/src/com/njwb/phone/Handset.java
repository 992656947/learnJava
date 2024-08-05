package chapter08.chapter08.src.com.njwb.phone;

public class Handset {

    protected String brand;

    protected String type ;

    public Handset() {
    }

    public Handset(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void call(){
        System.out.println("打电话");
    }
    public void sendInfo(){
        System.out.println("发信息");
    }
    public String info(){
        return "手机品牌："+brand+"， 型号："+brand;
    }
}
