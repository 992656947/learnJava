package chapter08.chapter08.src.com.njwb.phone;

public class CommanHandSet extends Handset implements Playable {


    public CommanHandSet() {
    }

    public CommanHandSet(String brand, String type) {
        super(brand, type);
    }

    public void play(String content)  {
        System.out.println("正在使用普通手机播放："+content);
    }

}
