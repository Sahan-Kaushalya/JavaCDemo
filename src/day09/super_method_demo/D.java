package day09.super_method_demo;

public class D {
    int a = 500;

    public D() {
        System.out.println("Constructor of class D");
    }

    public D(int a) {
        this.a = a;
    }

    public void display() {
        System.out.println("This is class D");
    }
}
