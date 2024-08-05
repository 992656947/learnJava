package chapter01.src.com.new7_15.CellAndPhone;

public class Phone {
    public  Cell cell;
    public String type;

    public void playMusic() {
        System.out.println("播放音乐.....");
    }
    public void getPower(){
        cell.getPower();
    }
}
