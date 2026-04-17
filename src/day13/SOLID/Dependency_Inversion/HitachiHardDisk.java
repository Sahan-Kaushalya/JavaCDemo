package day13.SOLID.Dependency_Inversion;

public class HitachiHardDisk implements HardDisks{

    @Override
    public void storeData() {
        System.out.println("Storing data on Hitachi hard disk.");
    }

}
