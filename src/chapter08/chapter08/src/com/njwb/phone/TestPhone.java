package chapter08.chapter08.src.com.njwb.phone;

public class TestPhone {
    public static void main(String[] args) {

        CommanHandSet commanHandSet = new CommanHandSet("诺基亚","N72");
        System.out.println( commanHandSet.info());
        commanHandSet.play("青花瓷");
        commanHandSet.sendInfo();
        commanHandSet.call();
        System.out.println("-------------------------------------");

        AptitudeHandset aptitudeHandset = new AptitudeHandset("苹果","8plus");
        System.out.println(aptitudeHandset.info());
        aptitudeHandset.netConnection();
        aptitudeHandset.takePhoto();
        aptitudeHandset.play("青花瓷");
        aptitudeHandset.call();
        aptitudeHandset.sendInfo();


    }
}
