package day08.inheritance;

public class Calculator {
    public static String company = "CalcCorp";
    public String brand = "day08.inheritance.Calculator";
    private String model = "Model X";
    protected double version = 1.0;

    public Calculator() {
    }

    public Calculator(String brand, String model, double version) {
        this.brand = brand;
        this.model = model;
        this.version = version;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Calculator.company = company;
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

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
