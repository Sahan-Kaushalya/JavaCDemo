package day12.coupling;


public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setBrand("Dell");
        laptop.setModel("XPS 15");
        laptop.setHardDisk(new AsusHD("125GB"));
        System.out.println(laptop);
    }
}

