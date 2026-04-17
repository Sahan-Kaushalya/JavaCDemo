package day13.SOLID.Dependency_Inversion;

public class AsusHardDisk implements HardDisks{

    @Override
    public void storeData() {
        System.out.println("Storing data on Asus hard disk.");
    }

}
