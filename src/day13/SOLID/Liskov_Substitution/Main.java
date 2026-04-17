package day13.SOLID.Liskov_Substitution;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("XPS 15");
        /* AsusHD asusHD = new AsusHD("32gb");
         asusHD.storeData();*/
        laptop.setHardDisk(HardDiskFactory.getHardDisk(HardDiskType.ASUS, 16));//setter injection
        System.out.println(laptop);


        Laptop laptop2 = new Laptop("Asus", "ZenBook",
                HardDiskFactory.getHardDisk(HardDiskType.DELL, 32));//constructor injection
        System.out.println(laptop2);
    }
}
