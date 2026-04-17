package day13.SOLID.Dependency_Inversion;

public class DellHardDisk implements HardDisks{

    @Override
    public void storeData() {
        System.out.println("Storing data on Dell hard disk.");
    }

}
