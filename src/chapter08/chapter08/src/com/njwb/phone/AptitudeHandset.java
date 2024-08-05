package chapter08.chapter08.src.com.njwb.phone;

public class AptitudeHandset extends Handset implements TakePhotoable,NetWork,Playable {

    public AptitudeHandset() {
    }

    public AptitudeHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void netConnection() {
        System.out.println(super.info()+"正在在联网中....");
    }

    @Override
    public void play(String content) {
        System.out.println(super.info()+"正在播放："+content);
    }

    @Override
    public void takePhoto() {
        System.out.println(super.info()+"正在拍照");
    }
}
