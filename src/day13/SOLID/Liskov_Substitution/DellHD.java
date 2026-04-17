package day13.SOLID.Liskov_Substitution;

public class DellHD implements HardDisk {

    private String capacity;

    public DellHD(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public void storeData() {
        System.out.println("Storing data on Dell hard disk.");
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}