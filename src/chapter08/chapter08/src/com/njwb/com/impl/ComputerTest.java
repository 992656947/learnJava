package chapter08.chapter08.src.com.njwb.com.impl;

import com.njwb.com.Cache;
import com.njwb.com.Computer;
import com.njwb.com.Cpu;
import com.njwb.com.Disk;

public class ComputerTest {
    public static void main(String[] args) {
        Cpu cpu = new AmdCpu();
        Disk disk = new ElementDisk(500);
        Cache cache  = new SangCache(16);
        Computer computer = new Computer(cpu,disk,cache);

        computer.showConfigOfthisComputer();

        System.out.println("----------------------");
        //升级内存的操作

        cache = new KingstonCache(32);

        computer.setCache(cache);
        computer.showConfigOfthisComputer();

        System.out.println("--------------------------");

        computer.setCpu(new IntelCpu());
        computer.showConfigOfthisComputer();




    }
}
