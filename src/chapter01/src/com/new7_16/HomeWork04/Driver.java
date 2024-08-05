package chapter01.src.com.new7_16.HomeWork04;

public class Driver {
    private String name;

    public Driver(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void driveCar(Benz benz) {
        System.out.println(name + " 在开车");
        benz.run();
    }
}
