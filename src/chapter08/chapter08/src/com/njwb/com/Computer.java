package chapter08.chapter08.src.com.njwb.com;




public class Computer {

    private Cache cache;

    private Cpu cpu ;

    private Disk disk;


    public Computer( Cpu cpu, Disk disk,Cache cache) {
        this.cache = cache;
        this.cpu = cpu;
        this.disk = disk;
    }

    public Cache getCache() {
        return cache;
    }

    public void setCache(Cache cache) {
        this.cache = cache;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public void showConfigOfthisComputer(){
        System.out.println("cpu品牌："+cpu.getBrand()+",主频："+cpu.getPower()+"GHZ");
        System.out.println("内存："+cache.getSize());
        System.out.println("硬盘："+disk.getSize());
    }


}
