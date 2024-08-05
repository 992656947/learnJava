package chapter08.chapter08.src.com.njwb.usb.test;
import com.njwb.usb.entity.Computer;
import com.njwb.usb.impl.Mouse;
import com.njwb.usb.impl.UDisk;
import com.njwb.usb.impl.UsbFen;

public class UsbTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //父类引用指向子类对象
        computer.pluign(new Mouse() );
        computer.pluign(new UDisk() );
        computer.pluign(new UsbFen() );

    }
}
