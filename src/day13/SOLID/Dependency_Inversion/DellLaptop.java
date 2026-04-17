package day13.SOLID.Dependency_Inversion;

public class DellLaptop {
    private HardDisks hardDisk;

    public DellLaptop(HardDisks hardDisk) {
        this.hardDisk = hardDisk;
    }

    public HardDisks getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisks hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void start() {
        System.out.println("\nDell Laptop is starting...");
    }

    public void shutdown() {
        System.out.println("Dell Laptop is shutting down...");
    }

    public static void main(String[] args) {

        DellHardDisk hardDisk = new DellHardDisk();
        DellLaptop laptop = new DellLaptop(hardDisk);
        laptop.start();
        laptop.hardDisk.storeData();
        laptop.shutdown();

        laptop.setHardDisk(new AsusHardDisk());
        laptop.start();
        laptop.hardDisk.storeData();
        laptop.shutdown();

        laptop.setHardDisk(new HitachiHardDisk());
        laptop.start();
        laptop.hardDisk.storeData();
        laptop.shutdown();
    }
}
