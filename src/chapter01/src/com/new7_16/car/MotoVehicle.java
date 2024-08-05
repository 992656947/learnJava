package chapter01.src.com.new7_16.car;

public abstract class MotoVehicle {
    private String No;
    private String Brand;
    private String Color;
    private float Mileeage;

    public MotoVehicle(String No, String Brand, String Color, float Mileeage) {
        this.No = No;
        this.Brand = Brand;
        this.Color = Color;
        this.Mileeage = Mileeage;
    }

    public MotoVehicle() {}

    abstract void CalcRent(int days);


}
