package AllHomeWork.src.com.HomeWork7_18_3;

public class SmartAudi extends Car{
    public SmartAudi(String name) {
        super(name);
    }

    public void automaticParking() {
        System.out.println(super.getName()+"可以自动泊车");
    }

    public void automaticDrive() {
        System.out.println(super.getName()+"可以无人驾驶");
    }
}
