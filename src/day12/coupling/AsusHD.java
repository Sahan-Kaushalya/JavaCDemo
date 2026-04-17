package day12.coupling;

public class AsusHD implements HardDisk {

    private String capacity;

    public AsusHD(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public void storeData() {
        System.out.println("Storing data on Asus hard disk.");
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}