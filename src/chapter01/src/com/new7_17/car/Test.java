package chapter01.src.com.new7_17.car;

public class Test {
    public static void main(String[] args) {
        Master master = new Master();
        MotoVehicle car1 = new Car("111","bmw","白",100,"550");
        MotoVehicle bus1 = new Bus("222","金龙","黑",300,15);
        master.rentMotos(new MotoVehicle[]{car1,bus1},3);
    }
}
