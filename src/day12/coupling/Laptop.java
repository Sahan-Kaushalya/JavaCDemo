package day12.coupling;

public class Laptop {

    private String brand;
    private String model;

    private HardDisk hardDisk;

    public Laptop() {
    }

    public Laptop(String brand, String model, HardDisk hardDisk) {
        this.brand = brand;
        this.model = model;
        this.hardDisk = hardDisk;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", hardDisk=" + hardDisk +
                '}';
    }
}