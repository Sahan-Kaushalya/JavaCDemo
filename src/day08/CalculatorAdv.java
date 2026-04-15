package day08;

import day08.inheritance.Calculator;

public class CalculatorAdv extends Calculator {

    public CalculatorAdv() {
        super("New SK Calculator","Model SKV",2.0);
    }


    @Override
    public int add(int a, int b) {
        return super.add(a, b);
    }

    @Override
    public int subtract(int a, int b) {
        return super.subtract(a, b);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void displayInfo() {
        System.out.println("ahsh : "+super.brand);
        System.out.println("wee :"+ Calculator.company);
        System.out.println("New Calculator Brand: " + getBrand());
        System.out.println("New Calculator Version: " + getVersion());
        System.out.println("Company: " + getCompany());
        System.out.println("hd: "+super.version);
        System.out.println(super.getModel());

        Calculator calc = new Calculator();
        // System.out.println("Brand from instance: " + calc.version);
    }

    public static void main(String[] args) {
        CalculatorAdv calcAdv = new CalculatorAdv();
        System.out.println("Addition: " + calcAdv.add(5, 3));
        System.out.println("Subtraction: " + calcAdv.subtract(10, 4));
        System.out.println("Multiplication: " + calcAdv.multiply(6, 7));
        calcAdv.displayInfo();
    }
}
