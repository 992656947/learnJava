package chapter08_1.src.com.new1.phone;

public class Test {
    public static void main(String[] args) {
        Handset commonHandset = new CommanHandset("G502c", "Sony Ericsson");
        commonHandset.info();
        commonHandset.call();
        commonHandset.sendInfo();

        System.out.println();

        AptitudeHandset smartHandset = new AptitudeHandset("HTC", "I9100");
        smartHandset.info();
        smartHandset.networkConn();
        smartHandset.play("video");
        smartHandset.takePhoto();
        smartHandset.sendInfo();
        smartHandset.call();
    }
}
