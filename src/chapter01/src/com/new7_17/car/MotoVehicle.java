package chapter01.src.com.new7_17.car;

public abstract class MotoVehicle {
    private String No;
    private String Brand;
    private String Color;
    private int Mileage;
    public MotoVehicle(){}
    public MotoVehicle(String No,String Brand,String Color,int Mileage){
        this.No = No;
        this.Brand = Brand;
        this.Color = Color;
        this.Mileage = Mileage;
    }
    //get
    public String getNo(){ return No; }
    public String getColor(){ return Color; }
    public String getBrand(){ return Brand; }
    public int getMileage(){ return Mileage; }
    //set
    public void setNo(String No){this.No = No;}
    public void setColor(String Color){this.Color = Color;}
    public void setBrand(String Brand){this.Brand = Brand;}
    public void setMileage(int Mileage){this.Mileage = Mileage;}

    public abstract int calcRent(int day);
    public String toString(){return "车牌号是："+this.No+"\t品牌是："+this.Brand+"\t颜色是："+this.Color+"\t历程数是："+this.Mileage;}


}
