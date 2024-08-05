package chapter08_1.src.com.new1.phone;

import com.new1.door.TakePhoto;

public class AptitudeHandset extends Handset implements TakePhoto,Network,Playable {
    public AptitudeHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void networkConn() {
        System.out.println("Connecting to network...");
    }

    @Override
    public void play(String content) {
        System.out.println("Playing " + content + "...");
    }

    @Override
    public void info() {
        System.out.println("Smartphone info: " + brand + " " + type);
    }
}
