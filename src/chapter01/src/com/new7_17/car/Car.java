package chapter01.src.com.new7_17.car;

public class Car extends MotoVehicle {
    private String type;

    public Car(String No, String Brand, String Color, int Mileage, String type) {
        super(No, Brand, Color, Mileage);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public int calcRent(int day){
        if("bmw".equals(super.getBrand())){
            return 500*day;
        }else if("别克".equals(super.getBrand())){
            return 600*day;
        }else if("林荫大道".equals(super.getBrand())){
            return 800*day;
        }
        return 0;
    }

    public void setType(String type) {
        this.type = type;
    }
}
